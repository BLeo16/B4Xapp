B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Dim apiPost As Posts
	Private Root As B4XView
	Private xui As XUI
	Private txt_postId As EditText
	Private txt_title As EditText
	Private txt_content As EditText
	Private txt_userId As EditText
End Sub

Public Sub Initialize
	Return Me
End Sub

Private Sub B4XPage_Created(Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("PostLayout")
	apiPost.Initialize("https://apiusers-cmx9.onrender.com/api/Posts")
End Sub

Private Sub cmd_ReadPostById_Click
	Try
		Wait For (apiPost.Read_ById(txt_postId.Text)) Complete (post As Post)
		If post <> Null Then
			Log(post)
			If post.id > 0 Then
				txt_title.Text = post.title
				txt_content.Text = post.content
				txt_userId.Text = post.userId
				Msgbox("Post leído correctamente", "OK")
			Else
				Msgbox("No se pudo leer el post", "Error")
			End If
		Else
			Msgbox("Error leyendo el post", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_UpdatePost_Click
	Try
		Wait For (apiPost.Update(txt_postId.Text, txt_title.Text, txt_content.Text, txt_userId.Text)) Complete (r As Boolean)
		If r Then
			Msgbox("Post actualizado correctamente", "OK")
		Else
			Msgbox("No se pudo actualizar el post", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_DeletePost_Click
	Try
		Wait For (apiPost.Delete(txt_postId.Text)) Complete (r As Boolean)
		If r Then
			txt_postId.Text = ""
			txt_title.Text = ""
			txt_content.Text = ""
			txt_userId.Text = ""
			Msgbox("Post eliminado correctamente", "OK")
		Else
			Msgbox("No se pudo eliminar el post", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_CreatePost_Click
	Try
		Wait For (apiPost.Create(txt_title.Text, txt_content.Text, txt_userId.Text)) Complete (post As Post)
		If post <> Null And post.id > 0 Then
			Msgbox("Post creado correctamente", "OK")
		Else
			Msgbox("No se pudo crear el post", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmdBackPage_Click
	B4XPages.ClosePage(Me)
End Sub