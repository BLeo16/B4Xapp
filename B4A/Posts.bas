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

Public Sub Create(title As String, content As String, userId As Int) As ResumableSub
	Dim json As String
	Dim pst As Post
	Dim data As Map

	pst.Initialize()
	json = "{'title':'" & title & "', 'content':'" & content & "', 'userId':" & userId & "}"
	apiJob.Initialize("", Me)
	apiJob.PostString(ApiUrl, json)
	apiJob.GetRequest.SetContentType("application/json")

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		pst.id = data.Get("id")
		pst.title = data.Get("title")
		pst.content = data.Get("content")
		pst.userId = data.Get("userId")
	Else
		Log("Error creating post: " & resultado.ErrorMessage)
		Return Null
	End If

	Return pst
End Sub

Public Sub Read_All() As ResumableSub
	Dim psts As List
	Dim map As Map
	Dim lst As List

	psts.Initialize
	apiJob.Initialize("", Me)
	apiJob.Download(ApiUrl)

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst = jsonParser.NextArray
		For i = 0 To lst.Size - 1
			map = lst.Get(i)
			Dim pst As Post
			pst.Initialize
			pst.id = map.Get("id")
			pst.title = map.Get("title")
			pst.content = map.Get("content")
			pst.userId = map.Get("userId")
			psts.Add(pst)
		Next
	Else
		Log("Error reading posts: " & resultado.ErrorMessage)
		Return Null
	End If

	Return psts
End Sub

Public Sub Read_ById(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	Dim pst As Post
	pst.Initialize
	apiJob.Download(ApiUrl & "/" & id)

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		pst.id = map.Get("id")
		pst.title = map.Get("title")
		pst.content = map.Get("content")
		pst.userId = map.Get("userId")
	Else
		Log("Error reading post by ID: " & resultado.ErrorMessage)
		Return Null
	End If
	Return pst
End Sub

Public Sub Update(id As Int, title As String, content As String, userId As Int) As ResumableSub
	Dim pst As Post
	Dim json As String

	pst.Initialize()
	json = "{ 'id' : " & id & ", 'title' : '" & title & "', 'content': '" & content & "', 'userId': " & userId & " }"
	apiJob.Initialize("", Me)
	apiJob.PutString(ApiUrl & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")

	Wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		Return True
	Else
		Log("Error updating post: " & resultado.ErrorMessage)
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
		Log("Error deleting post: " & resultado.ErrorMessage)
		Return False
	End If
End Sub
