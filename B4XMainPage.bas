B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
Sub Class_Globals
	Dim apiUser As Users
	Private Root As B4XView
	Private xui As XUI
	Private txt_id As EditText
	Private txt_username As EditText
	Private txt_password As EditText
	
	Public postPage As PostPage

End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created(Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	apiUser.Initialize("https://apiusers-cmx9.onrender.com/api/Users")
End Sub

Private Sub cmd_ReadById_Click
	Try
		Wait For (apiUser.Read_ById(txt_id.Text)) Complete (usr As User)
		If usr <> Null Then
			Log(usr)
			If usr.id > 0 Then
				txt_username.Text = usr.username
				txt_password.Text = usr.password
				Msgbox("Usuario leído correctamente", "OK")
			Else
				Msgbox("No se pudo leer el usuario", "Error")
			End If
		Else
			Msgbox("Error leyendo el usuario", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_Update_Click
	Try
		Wait For (apiUser.Update(txt_id.Text, txt_username.Text, txt_password.Text)) Complete (r As Boolean)
		If r Then
			Msgbox("Usuario actualizado correctamente", "OK")
		Else
			Msgbox("No se pudo actualizar el usuario", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_Delete_Click
	Try
		Wait For (apiUser.Delete(txt_id.Text)) Complete (r As Boolean)
		If r Then
			txt_id.Text = ""
			txt_username.Text = ""
			txt_password.Text = ""
			Msgbox("Usuario eliminado correctamente", "OK")
		Else
			Msgbox("No se pudo eliminar el usuario", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_Create_Click
	Try
		Wait For (apiUser.Create(txt_username.Text, txt_password.Text)) Complete (usr As User)
		If usr <> Null And usr.id > 0 Then
			Msgbox("Usuario creado correctamente", "OK")
		Else
			Msgbox("Username (min. 5 caracteres), Password (min. 8 caracteres)", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmd_goPost_Click
	If postPage.IsInitialized = False Then
		postPage.Initialize
		B4XPages.AddPageAndCreate("postPage",postPage)
		B4XPages.ShowPage("postPage")
		
	Else
		B4XPages.ShowPage("postPage")
	End If
End Sub
