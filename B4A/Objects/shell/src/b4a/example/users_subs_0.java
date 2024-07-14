package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class users_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
users._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",users._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
users._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",users._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public ApiUrl As String";
users._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",users._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Create (users) ","users",5,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "users","create", __ref, _username, _password);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_username,_password);
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
public ResumableSub_Create(b4a.example.users parent,RemoteObject __ref,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.users parent;
RemoteObject _username;
RemoteObject _password;
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _usr = RemoteObject.declareNull("b4a.example.user");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (users) ","users",5,__ref.getField(false, "ba"),__ref,11);
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
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 12;BA.debugLine="Dim json As String";
Debug.ShouldStop(2048);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 13;BA.debugLine="Dim usr As User";
Debug.ShouldStop(4096);
_usr = RemoteObject.createNew ("b4a.example.user");Debug.locals.put("usr", _usr);
 BA.debugLineNum = 14;BA.debugLine="Dim data As Map";
Debug.ShouldStop(8192);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 16;BA.debugLine="usr.Initialize()";
Debug.ShouldStop(32768);
_usr.runClassMethod (b4a.example.user.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="json = \"{'username':'\" & username & \"', 'password";
Debug.ShouldStop(65536);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'username':'"),_username,RemoteObject.createImmutable("', 'password':'"),_password,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
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
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "users", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
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
 BA.debugLineNum = 26;BA.debugLine="usr.id = data.Get(\"id\")";
Debug.ShouldStop(33554432);
_usr.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 27;BA.debugLine="usr.username = data.Get(\"username\")";
Debug.ShouldStop(67108864);
_usr.setField ("_username" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 28;BA.debugLine="usr.password = data.Get(\"password\")";
Debug.ShouldStop(134217728);
_usr.setField ("_password" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 30;BA.debugLine="Log(\"Error creating user: \" & resultado.ErrorMes";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","510289171",RemoteObject.concat(RemoteObject.createImmutable("Error creating user: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 31;BA.debugLine="Return Null";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 34;BA.debugLine="Return usr";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_usr));return;};
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (users) ","users",5,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "users","delete", __ref, _id);}
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
public ResumableSub_Delete(b4a.example.users parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.users parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (users) ","users",5,__ref.getField(false, "ba"),__ref,106);
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
 BA.debugLineNum = 107;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 108;BA.debugLine="apiJob.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(2048);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 110;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "users", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 111;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 112;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 114;BA.debugLine="Log(\"Error deleting user: \" & resultado.ErrorMes";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","510551304",RemoteObject.concat(RemoteObject.createImmutable("Error deleting user: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 115;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Initialize (users) ","users",5,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "users","initialize", __ref, _ba, _url);}
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
public static RemoteObject  _login(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Login (users) ","users",5,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("login")) { return __ref.runUserSub(false, "users","login", __ref, _username, _password);}
ResumableSub_Login rsub = new ResumableSub_Login(null,__ref,_username,_password);
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
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(b4a.example.users parent,RemoteObject __ref,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.users parent;
RemoteObject _username;
RemoteObject _password;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Login (users) ","users",5,__ref.getField(false, "ba"),__ref,119);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (users) ","users",5,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "users","read_all", __ref);}
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
public ResumableSub_Read_All(b4a.example.users parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.users parent;
RemoteObject _usrs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
RemoteObject _usr = RemoteObject.declareNull("b4a.example.user");
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (users) ","users",5,__ref.getField(false, "ba"),__ref,37);
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
 BA.debugLineNum = 38;BA.debugLine="Dim usrs As List";
Debug.ShouldStop(32);
_usrs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("usrs", _usrs);
 BA.debugLineNum = 39;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 40;BA.debugLine="Dim lst As List";
Debug.ShouldStop(128);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 42;BA.debugLine="usrs.Initialize";
Debug.ShouldStop(512);
_usrs.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 44;BA.debugLine="apiJob.Download(ApiUrl)";
Debug.ShouldStop(2048);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "users", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 47;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 48;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(32768);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(65536);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 50;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 51;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(262144);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 52;BA.debugLine="Dim usr As User";
Debug.ShouldStop(524288);
_usr = RemoteObject.createNew ("b4a.example.user");Debug.locals.put("usr", _usr);
 BA.debugLineNum = 53;BA.debugLine="usr.Initialize";
Debug.ShouldStop(1048576);
_usr.runClassMethod (b4a.example.user.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="usr.id = map.Get(\"id\")";
Debug.ShouldStop(2097152);
_usr.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 55;BA.debugLine="usr.username = map.Get(\"username\")";
Debug.ShouldStop(4194304);
_usr.setField ("_username" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 56;BA.debugLine="usr.password = map.Get(\"password\")";
Debug.ShouldStop(8388608);
_usr.setField ("_password" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 BA.debugLineNum = 57;BA.debugLine="usrs.Add(usr)";
Debug.ShouldStop(16777216);
_usrs.runVoidMethod ("Add",(Object)((_usr)));
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
 BA.debugLineNum = 60;BA.debugLine="Log(\"Error reading users: \" & resultado.ErrorMes";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","510354711",RemoteObject.concat(RemoteObject.createImmutable("Error reading users: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 61;BA.debugLine="Return Null";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="Return usrs";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_usrs));return;};
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Read_ById (users) ","users",5,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "users","read_byid", __ref, _id);}
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
public ResumableSub_Read_ById(b4a.example.users parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.users parent;
RemoteObject _id;
RemoteObject _usr = RemoteObject.declareNull("b4a.example.user");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (users) ","users",5,__ref.getField(false, "ba"),__ref,67);
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
 BA.debugLineNum = 68;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(8);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 69;BA.debugLine="Dim usr As User";
Debug.ShouldStop(16);
_usr = RemoteObject.createNew ("b4a.example.user");Debug.locals.put("usr", _usr);
 BA.debugLineNum = 70;BA.debugLine="usr.Initialize";
Debug.ShouldStop(32);
_usr.runClassMethod (b4a.example.user.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 71;BA.debugLine="apiJob.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(64);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 73;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "users", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 74;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 75;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(1024);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 76;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(2048);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 77;BA.debugLine="usr.id = map.Get(\"id\")";
Debug.ShouldStop(4096);
_usr.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 78;BA.debugLine="usr.username = map.Get(\"username\")";
Debug.ShouldStop(8192);
_usr.setField ("_username" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 79;BA.debugLine="usr.password = map.Get(\"password\")";
Debug.ShouldStop(16384);
_usr.setField ("_password" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 81;BA.debugLine="Log(\"Error reading user by ID: \" & resultado.Err";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","510420238",RemoteObject.concat(RemoteObject.createImmutable("Error reading user by ID: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 82;BA.debugLine="Return Null";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 84;BA.debugLine="Return usr";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_usr));return;};
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Update (users) ","users",5,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "users","update", __ref, _id, _username, _password);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_username,_password);
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
public ResumableSub_Update(b4a.example.users parent,RemoteObject __ref,RemoteObject _id,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.users parent;
RemoteObject _id;
RemoteObject _username;
RemoteObject _password;
RemoteObject _usr = RemoteObject.declareNull("b4a.example.user");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (users) ","users",5,__ref.getField(false, "ba"),__ref,87);
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
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 88;BA.debugLine="Dim usr As User";
Debug.ShouldStop(8388608);
_usr = RemoteObject.createNew ("b4a.example.user");Debug.locals.put("usr", _usr);
 BA.debugLineNum = 89;BA.debugLine="Dim json As String";
Debug.ShouldStop(16777216);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 91;BA.debugLine="usr.Initialize()";
Debug.ShouldStop(67108864);
_usr.runClassMethod (b4a.example.user.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 92;BA.debugLine="json = \"{ 'id' : \" & id & \", 'username' : '\" & us";
Debug.ShouldStop(134217728);
_json = RemoteObject.concat(RemoteObject.createImmutable("{ 'id' : "),_id,RemoteObject.createImmutable(", 'username' : '"),_username,RemoteObject.createImmutable("', 'password': '"),_password,RemoteObject.createImmutable("' }"));Debug.locals.put("json", _json);
 BA.debugLineNum = 93;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 94;BA.debugLine="apiJob.PutString(ApiUrl & \"/\" & id, json)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 95;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 97;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "users", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 98;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 99;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 101;BA.debugLine="Log(\"Error updating user: \" & resultado.ErrorMes";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","510485774",RemoteObject.concat(RemoteObject.createImmutable("Error updating user: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 102;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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