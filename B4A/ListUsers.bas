B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim apiUser As Users
	Private lbl_users As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("ListUsersLayout")
	apiUser.Initialize("https://apiusers-cmx9.onrender.com/api/Users")
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub cmd_ReadAllUsers_Click
	Try
		Wait For (apiUser.Read_All) Complete (users As List)
		If users <> Null Then
			Dim usersText As String = ""
			For Each user As Map In users
				' Obtener id y username de cada usuario
				Dim id As Int = user.Get("id")
				Dim username As String = user.Get("username")
				' Concatenar id y username en el texto del label
				usersText = usersText & "ID: " & id & ", Username: " & username & CRLF ' Agrega cada usuario en una nueva línea
			Next
			' Muestra todos los usuarios en el label
			lbl_users.Text = usersText
			Msgbox("Usuarios leídos correctamente", "OK")
		Else
			Msgbox("No se pudo leer los usuarios", "Error")
		End If
	Catch
		Msgbox("Error: " & LastException.Message, "Error")
	End Try
End Sub

Private Sub cmdBackPage_Click
	B4XPages.ClosePage(Me)
End Sub