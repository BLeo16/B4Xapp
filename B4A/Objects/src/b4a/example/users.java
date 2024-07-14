package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class users extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.users");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.users.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.users __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="ApiUrl = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.users __ref,String _username,String _password) throws Exception{
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_username,_password}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.users parent,b4a.example.users __ref,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
this.__ref = parent;
}
b4a.example.users __ref;
b4a.example.users parent;
String _username;
String _password;
String _json = "";
b4a.example.user _usr = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="users";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Dim usr As User";
_usr = new b4a.example.user();
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="usr.Initialize()";
_usr._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="json = \"{'username':'\" & username & \"', 'password";
_json = "{'username':'"+_username+"', 'password':'"+_password+"'}";
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="apiJob.PostString(ApiUrl, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "users", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=10289165;
 //BA.debugLineNum = 10289165;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="usr.id = data.Get(\"id\")";
_usr._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="usr.username = data.Get(\"username\")";
_usr._username /*String*/  = BA.ObjectToString(_data.Get((Object)("username")));
RDebugUtils.currentLine=10289169;
 //BA.debugLineNum = 10289169;BA.debugLine="usr.password = data.Get(\"password\")";
_usr._password /*String*/  = BA.ObjectToString(_data.Get((Object)("password")));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10289171;
 //BA.debugLineNum = 10289171;BA.debugLine="Log(\"Error creating user: \" & resultado.ErrorMes";
parent.__c.LogImpl("510289171","Error creating user: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=10289172;
 //BA.debugLineNum = 10289172;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=10289175;
 //BA.debugLineNum = 10289175;BA.debugLine="Return usr";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_usr));return;};
RDebugUtils.currentLine=10289176;
 //BA.debugLineNum = 10289176;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.users __ref,int _id) throws Exception{
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.users parent,b4a.example.users __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.users __ref;
b4a.example.users parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="users";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="apiJob.Delete(ApiUrl & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "users", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Log(\"Error deleting user: \" & resultado.ErrorMes";
parent.__c.LogImpl("510551304","Error deleting user: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.users __ref,int _id) throws Exception{
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.users parent,b4a.example.users __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.users __ref;
b4a.example.users parent;
int _id;
b4a.example.user _usr = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="users";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Dim usr As User";
_usr = new b4a.example.user();
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="usr.Initialize";
_usr._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="apiJob.Download(ApiUrl & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "users", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="usr.id = map.Get(\"id\")";
_usr._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="usr.username = map.Get(\"username\")";
_usr._username /*String*/  = BA.ObjectToString(_map.Get((Object)("username")));
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="usr.password = map.Get(\"password\")";
_usr._password /*String*/  = BA.ObjectToString(_map.Get((Object)("password")));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="Log(\"Error reading user by ID: \" & resultado.Err";
parent.__c.LogImpl("510420238","Error reading user by ID: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="Return usr";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_usr));return;};
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.users __ref,int _id,String _username,String _password) throws Exception{
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_username,_password}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.users parent,b4a.example.users __ref,int _id,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._username = _username;
this._password = _password;
this.__ref = parent;
}
b4a.example.users __ref;
b4a.example.users parent;
int _id;
String _username;
String _password;
b4a.example.user _usr = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="users";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim usr As User";
_usr = new b4a.example.user();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="usr.Initialize()";
_usr._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="json = \"{ 'id' : \" & id & \", 'username' : '\" & us";
_json = "{ 'id' : "+BA.NumberToString(_id)+", 'username' : '"+_username+"', 'password': '"+_password+"' }";
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="apiJob.PutString(ApiUrl & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "users", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="Log(\"Error updating user: \" & resultado.ErrorMes";
parent.__c.LogImpl("510485774","Error updating user: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.users __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="users";
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login(b4a.example.users __ref,String _username,String _password) throws Exception{
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "login", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
ResumableSub_Login rsub = new ResumableSub_Login(this,__ref,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(b4a.example.users parent,b4a.example.users __ref,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
this.__ref = parent;
}
b4a.example.users __ref;
b4a.example.users parent;
String _username;
String _password;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="users";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.users __ref) throws Exception{
RDebugUtils.currentModule="users";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.users parent,b4a.example.users __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.users __ref;
b4a.example.users parent;
anywheresoftware.b4a.objects.collections.List _usrs = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
b4a.example.user _usr = null;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="users";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim usrs As List";
_usrs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="usrs.Initialize";
_usrs.Initialize();
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="apiJob.Download(ApiUrl)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "users", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="For i = 0 To lst.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step11 = 1;
limit11 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="Dim usr As User";
_usr = new b4a.example.user();
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="usr.Initialize";
_usr._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="usr.id = map.Get(\"id\")";
_usr._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="usr.username = map.Get(\"username\")";
_usr._username /*String*/  = BA.ObjectToString(_map.Get((Object)("username")));
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="usr.password = map.Get(\"password\")";
_usr._password /*String*/  = BA.ObjectToString(_map.Get((Object)("password")));
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="usrs.Add(usr)";
_usrs.Add((Object)(_usr));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=10354711;
 //BA.debugLineNum = 10354711;BA.debugLine="Log(\"Error reading users: \" & resultado.ErrorMes";
parent.__c.LogImpl("510354711","Error reading users: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="Return usrs";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_usrs));return;};
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}