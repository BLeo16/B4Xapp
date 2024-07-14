B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public ApiUrl As String
End Sub

Public Sub Initialize(url As String)
	ApiUrl = url
End Sub

Public Sub Create(username As String, password As String) As ResumableSub
	Dim json As String
	Dim usr As User
	Dim data As Map

	usr.Initialize()
	json = "{'username':'" & username & "', 'password':'" & password & "'}"
	apiJob.Initialize("", Me)
	apiJob.PostString(ApiUrl, json)
	apiJob.GetRequest.SetContentType("application/json")

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		usr.id = data.Get("id")
		usr.username = data.Get("username")
		usr.password = data.Get("password")
	Else
		Log("Error creating user: " & resultado.ErrorMessage)
		Return Null
	End If

	Return usr
End Sub

Public Sub Read_All() As ResumableSub
	Dim usrs As List
	Dim map As Map
	Dim lst As List

	usrs.Initialize
	apiJob.Initialize("", Me)
	apiJob.Download(ApiUrl)

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst = jsonParser.NextArray
		For i = 0 To lst.Size - 1
			map = lst.Get(i)
			Dim usr As User
			usr.Initialize
			usr.id = map.Get("id")
			usr.username = map.Get("username")
			usr.password = map.Get("password")
			usrs.Add(usr)
		Next
	Else
		Log("Error reading users: " & resultado.ErrorMessage)
		Return Null
	End If

	Return usrs
End Sub

Public Sub Read_ById(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	Dim usr As User
	usr.Initialize
	apiJob.Download(ApiUrl & "/" & id)

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		usr.id = map.Get("id")
		usr.username = map.Get("username")
		usr.password = map.Get("password")
	Else
		Log("Error reading user by ID: " & resultado.ErrorMessage)
		Return Null
	End If
	Return usr
End Sub

Public Sub Update(id As Int, username As String, password As String) As ResumableSub
	Dim usr As User
	Dim json As String

	usr.Initialize()
	json = "{ 'id' : " & id & ", 'username' : '" & username & "', 'password': '" & password & "' }"
	apiJob.Initialize("", Me)
	apiJob.PutString(ApiUrl & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		Return True
	Else
		Log("Error updating user: " & resultado.ErrorMessage)
		Return False
	End If
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete(ApiUrl & "/" & id)

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		Return True
	Else
		Log("Error deleting user: " & resultado.ErrorMessage)
		Return False
	End If
End Sub

Public Sub Login(username As String, password As String) As ResumableSub
	' Implementar el método de login si es necesario
End Sub
