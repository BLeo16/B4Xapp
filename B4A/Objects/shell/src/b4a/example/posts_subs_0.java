package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class posts_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
posts._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",posts._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
posts._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",posts._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public ApiUrl As String";
posts._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",posts._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _title,RemoteObject _content,RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("Create (posts) ","posts",6,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "posts","create", __ref, _title, _content, _userid);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_title,_content,_userid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.posts parent,RemoteObject __ref,RemoteObject _title,RemoteObject _content,RemoteObject _userid) {
this.parent = parent;
this.__ref = __ref;
this._title = _title;
this._content = _content;
this._userid = _userid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.posts parent;
RemoteObject _title;
RemoteObject _content;
RemoteObject _userid;
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _pst = RemoteObject.declareNull("b4a.example.post");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (posts) ","posts",6,__ref.getField(false, "ba"),__ref,11);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("title", _title);
Debug.locals.put("content", _content);
Debug.locals.put("userId", _userid);
 BA.debugLineNum = 12;BA.debugLine="Dim json As String";
Debug.ShouldStop(2048);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 13;BA.debugLine="Dim pst As Post";
Debug.ShouldStop(4096);
_pst = RemoteObject.createNew ("b4a.example.post");Debug.locals.put("pst", _pst);
 BA.debugLineNum = 14;BA.debugLine="Dim data As Map";
Debug.ShouldStop(8192);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 16;BA.debugLine="pst.Initialize()";
Debug.ShouldStop(32768);
_pst.runClassMethod (b4a.example.post.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="json = \"{'title':'\" & title & \"', 'content':'\" &";
Debug.ShouldStop(65536);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'title':'"),_title,RemoteObject.createImmutable("', 'content':'"),_content,RemoteObject.createImmutable("', 'userId':"),_userid,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 18;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(131072);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 19;BA.debugLine="apiJob.PostString(ApiUrl, json)";
Debug.ShouldStop(262144);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 20;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(524288);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 22;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "posts", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 23;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 24;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(16777216);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 26;BA.debugLine="pst.id = data.Get(\"id\")";
Debug.ShouldStop(33554432);
_pst.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 27;BA.debugLine="pst.title = data.Get(\"title\")";
Debug.ShouldStop(67108864);
_pst.setField ("_title" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title"))))));
 BA.debugLineNum = 28;BA.debugLine="pst.content = data.Get(\"content\")";
Debug.ShouldStop(134217728);
_pst.setField ("_content" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content"))))));
 BA.debugLineNum = 29;BA.debugLine="pst.userId = data.Get(\"userId\")";
Debug.ShouldStop(268435456);
_pst.setField ("_userid" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userId"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 31;BA.debugLine="Log(\"Error creating post: \" & resultado.ErrorMes";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","513631508",RemoteObject.concat(RemoteObject.createImmutable("Error creating post: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 32;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 35;BA.debugLine="Return pst";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_pst));return;};
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (posts) ","posts",6,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "posts","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.posts parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.posts parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (posts) ","posts",6,__ref.getField(false, "ba"),__ref,109);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 110;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(8192);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 111;BA.debugLine="apiJob.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(16384);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 113;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "posts", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 114;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 115;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 117;BA.debugLine="Log(\"Error deleting post: \" & resultado.ErrorMes";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","513893640",RemoteObject.concat(RemoteObject.createImmutable("Error deleting post: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 118;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (posts) ","posts",6,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "posts","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="ApiUrl = url";
Debug.ShouldStop(128);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (posts) ","posts",6,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "posts","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.posts parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.posts parent;
RemoteObject _psts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
RemoteObject _pst = RemoteObject.declareNull("b4a.example.post");
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (posts) ","posts",6,__ref.getField(false, "ba"),__ref,38);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 39;BA.debugLine="Dim psts As List";
Debug.ShouldStop(64);
_psts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("psts", _psts);
 BA.debugLineNum = 40;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 41;BA.debugLine="Dim lst As List";
Debug.ShouldStop(256);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 43;BA.debugLine="psts.Initialize";
Debug.ShouldStop(1024);
_psts.runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(2048);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 45;BA.debugLine="apiJob.Download(ApiUrl)";
Debug.ShouldStop(4096);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "posts", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 48;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 10;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(131072);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 7;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 6;
if (true) break;

case 13:
//C
this.state = 12;
_i = ((int)(0 + _i + step11)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 52;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(524288);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 53;BA.debugLine="Dim pst As Post";
Debug.ShouldStop(1048576);
_pst = RemoteObject.createNew ("b4a.example.post");Debug.locals.put("pst", _pst);
 BA.debugLineNum = 54;BA.debugLine="pst.Initialize";
Debug.ShouldStop(2097152);
_pst.runClassMethod (b4a.example.post.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 55;BA.debugLine="pst.id = map.Get(\"id\")";
Debug.ShouldStop(4194304);
_pst.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 56;BA.debugLine="pst.title = map.Get(\"title\")";
Debug.ShouldStop(8388608);
_pst.setField ("_title" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title"))))));
 BA.debugLineNum = 57;BA.debugLine="pst.content = map.Get(\"content\")";
Debug.ShouldStop(16777216);
_pst.setField ("_content" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content"))))));
 BA.debugLineNum = 58;BA.debugLine="pst.userId = map.Get(\"userId\")";
Debug.ShouldStop(33554432);
_pst.setField ("_userid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userId"))))));
 BA.debugLineNum = 59;BA.debugLine="psts.Add(pst)";
Debug.ShouldStop(67108864);
_psts.runVoidMethod ("Add",(Object)((_pst)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("i", _i);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 62;BA.debugLine="Log(\"Error reading posts: \" & resultado.ErrorMes";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","513697048",RemoteObject.concat(RemoteObject.createImmutable("Error reading posts: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 63;BA.debugLine="Return Null";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 66;BA.debugLine="Return psts";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_psts));return;};
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (posts) ","posts",6,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "posts","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.posts parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.posts parent;
RemoteObject _id;
RemoteObject _pst = RemoteObject.declareNull("b4a.example.post");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (posts) ","posts",6,__ref.getField(false, "ba"),__ref,69);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 70;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(32);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 71;BA.debugLine="Dim pst As Post";
Debug.ShouldStop(64);
_pst = RemoteObject.createNew ("b4a.example.post");Debug.locals.put("pst", _pst);
 BA.debugLineNum = 72;BA.debugLine="pst.Initialize";
Debug.ShouldStop(128);
_pst.runClassMethod (b4a.example.post.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 73;BA.debugLine="apiJob.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(256);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 75;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "posts", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 76;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 77;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(4096);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(8192);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 79;BA.debugLine="pst.id = map.Get(\"id\")";
Debug.ShouldStop(16384);
_pst.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 80;BA.debugLine="pst.title = map.Get(\"title\")";
Debug.ShouldStop(32768);
_pst.setField ("_title" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title"))))));
 BA.debugLineNum = 81;BA.debugLine="pst.content = map.Get(\"content\")";
Debug.ShouldStop(65536);
_pst.setField ("_content" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content"))))));
 BA.debugLineNum = 82;BA.debugLine="pst.userId = map.Get(\"userId\")";
Debug.ShouldStop(131072);
_pst.setField ("_userid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userId"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 84;BA.debugLine="Log(\"Error reading post by ID: \" & resultado.Err";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","513762575",RemoteObject.concat(RemoteObject.createImmutable("Error reading post by ID: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 85;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 87;BA.debugLine="Return pst";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_pst));return;};
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _title,RemoteObject _content,RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("Update (posts) ","posts",6,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "posts","update", __ref, _id, _title, _content, _userid);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_title,_content,_userid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.posts parent,RemoteObject __ref,RemoteObject _id,RemoteObject _title,RemoteObject _content,RemoteObject _userid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._title = _title;
this._content = _content;
this._userid = _userid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.posts parent;
RemoteObject _id;
RemoteObject _title;
RemoteObject _content;
RemoteObject _userid;
RemoteObject _pst = RemoteObject.declareNull("b4a.example.post");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (posts) ","posts",6,__ref.getField(false, "ba"),__ref,90);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("title", _title);
Debug.locals.put("content", _content);
Debug.locals.put("userId", _userid);
 BA.debugLineNum = 91;BA.debugLine="Dim pst As Post";
Debug.ShouldStop(67108864);
_pst = RemoteObject.createNew ("b4a.example.post");Debug.locals.put("pst", _pst);
 BA.debugLineNum = 92;BA.debugLine="Dim json As String";
Debug.ShouldStop(134217728);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 94;BA.debugLine="pst.Initialize()";
Debug.ShouldStop(536870912);
_pst.runClassMethod (b4a.example.post.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 95;BA.debugLine="json = \"{ 'id' : \" & id & \", 'title' : '\" & title";
Debug.ShouldStop(1073741824);
_json = RemoteObject.concat(RemoteObject.createImmutable("{ 'id' : "),_id,RemoteObject.createImmutable(", 'title' : '"),_title,RemoteObject.createImmutable("', 'content': '"),_content,RemoteObject.createImmutable("', 'userId': "),_userid,RemoteObject.createImmutable(" }"));Debug.locals.put("json", _json);
 BA.debugLineNum = 96;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 97;BA.debugLine="apiJob.PutString(ApiUrl & \"/\" & id, json)";
Debug.ShouldStop(1);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 98;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(2);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 100;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "posts", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 101;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 102;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 104;BA.debugLine="Log(\"Error updating post: \" & resultado.ErrorMes";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","513828110",RemoteObject.concat(RemoteObject.createImmutable("Error updating post: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 105;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}