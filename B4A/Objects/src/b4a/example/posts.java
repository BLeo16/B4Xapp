package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class posts extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.posts");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.posts.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.posts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="posts";
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.posts __ref,String _title,String _content,int _userid) throws Exception{
RDebugUtils.currentModule="posts";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_title,_content,_userid}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_title,_content,_userid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.posts parent,b4a.example.posts __ref,String _title,String _content,int _userid) {
this.parent = parent;
this.__ref = __ref;
this._title = _title;
this._content = _content;
this._userid = _userid;
this.__ref = parent;
}
b4a.example.posts __ref;
b4a.example.posts parent;
String _title;
String _content;
int _userid;
String _json = "";
b4a.example.post _pst = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="posts";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Dim pst As Post";
_pst = new b4a.example.post();
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="pst.Initialize()";
_pst._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="json = \"{'title':'\" & title & \"', 'content':'\" &";
_json = "{'title':'"+_title+"', 'content':'"+_content+"', 'userId':"+BA.NumberToString(_userid)+"}";
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="apiJob.PostString(ApiUrl, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "posts", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=13631503;
 //BA.debugLineNum = 13631503;BA.debugLine="pst.id = data.Get(\"id\")";
_pst._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=13631504;
 //BA.debugLineNum = 13631504;BA.debugLine="pst.title = data.Get(\"title\")";
_pst._title /*String*/  = BA.ObjectToString(_data.Get((Object)("title")));
RDebugUtils.currentLine=13631505;
 //BA.debugLineNum = 13631505;BA.debugLine="pst.content = data.Get(\"content\")";
_pst._content /*String*/  = BA.ObjectToString(_data.Get((Object)("content")));
RDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="pst.userId = data.Get(\"userId\")";
_pst._userid /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("userId"))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13631508;
 //BA.debugLineNum = 13631508;BA.debugLine="Log(\"Error creating post: \" & resultado.ErrorMes";
parent.__c.LogImpl("513631508","Error creating post: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13631509;
 //BA.debugLineNum = 13631509;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=13631512;
 //BA.debugLineNum = 13631512;BA.debugLine="Return pst";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_pst));return;};
RDebugUtils.currentLine=13631513;
 //BA.debugLineNum = 13631513;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.posts __ref,int _id) throws Exception{
RDebugUtils.currentModule="posts";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.posts parent,b4a.example.posts __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.posts __ref;
b4a.example.posts parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="posts";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="apiJob.Delete(ApiUrl & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "posts", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="Log(\"Error deleting post: \" & resultado.ErrorMes";
parent.__c.LogImpl("513893640","Error deleting post: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.posts __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="posts";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="ApiUrl = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.posts __ref) throws Exception{
RDebugUtils.currentModule="posts";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.posts parent,b4a.example.posts __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.posts __ref;
b4a.example.posts parent;
anywheresoftware.b4a.objects.collections.List _psts = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
b4a.example.post _pst = null;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="posts";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim psts As List";
_psts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="psts.Initialize";
_psts.Initialize();
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="apiJob.Download(ApiUrl)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "posts", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="For i = 0 To lst.Size - 1";
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
RDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="Dim pst As Post";
_pst = new b4a.example.post();
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="pst.Initialize";
_pst._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="pst.id = map.Get(\"id\")";
_pst._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13697042;
 //BA.debugLineNum = 13697042;BA.debugLine="pst.title = map.Get(\"title\")";
_pst._title /*String*/  = BA.ObjectToString(_map.Get((Object)("title")));
RDebugUtils.currentLine=13697043;
 //BA.debugLineNum = 13697043;BA.debugLine="pst.content = map.Get(\"content\")";
_pst._content /*String*/  = BA.ObjectToString(_map.Get((Object)("content")));
RDebugUtils.currentLine=13697044;
 //BA.debugLineNum = 13697044;BA.debugLine="pst.userId = map.Get(\"userId\")";
_pst._userid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("userId"))));
RDebugUtils.currentLine=13697045;
 //BA.debugLineNum = 13697045;BA.debugLine="psts.Add(pst)";
_psts.Add((Object)(_pst));
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
RDebugUtils.currentLine=13697048;
 //BA.debugLineNum = 13697048;BA.debugLine="Log(\"Error reading posts: \" & resultado.ErrorMes";
parent.__c.LogImpl("513697048","Error reading posts: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13697049;
 //BA.debugLineNum = 13697049;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=13697052;
 //BA.debugLineNum = 13697052;BA.debugLine="Return psts";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_psts));return;};
RDebugUtils.currentLine=13697053;
 //BA.debugLineNum = 13697053;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.posts __ref,int _id) throws Exception{
RDebugUtils.currentModule="posts";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.posts parent,b4a.example.posts __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.posts __ref;
b4a.example.posts parent;
int _id;
b4a.example.post _pst = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="posts";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Dim pst As Post";
_pst = new b4a.example.post();
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="pst.Initialize";
_pst._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="apiJob.Download(ApiUrl & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "posts", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="pst.id = map.Get(\"id\")";
_pst._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="pst.title = map.Get(\"title\")";
_pst._title /*String*/  = BA.ObjectToString(_map.Get((Object)("title")));
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="pst.content = map.Get(\"content\")";
_pst._content /*String*/  = BA.ObjectToString(_map.Get((Object)("content")));
RDebugUtils.currentLine=13762573;
 //BA.debugLineNum = 13762573;BA.debugLine="pst.userId = map.Get(\"userId\")";
_pst._userid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("userId"))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13762575;
 //BA.debugLineNum = 13762575;BA.debugLine="Log(\"Error reading post by ID: \" & resultado.Err";
parent.__c.LogImpl("513762575","Error reading post by ID: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13762576;
 //BA.debugLineNum = 13762576;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=13762578;
 //BA.debugLineNum = 13762578;BA.debugLine="Return pst";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_pst));return;};
RDebugUtils.currentLine=13762579;
 //BA.debugLineNum = 13762579;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.posts __ref,int _id,String _title,String _content,int _userid) throws Exception{
RDebugUtils.currentModule="posts";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_title,_content,_userid}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_title,_content,_userid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.posts parent,b4a.example.posts __ref,int _id,String _title,String _content,int _userid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._title = _title;
this._content = _content;
this._userid = _userid;
this.__ref = parent;
}
b4a.example.posts __ref;
b4a.example.posts parent;
int _id;
String _title;
String _content;
int _userid;
b4a.example.post _pst = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="posts";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim pst As Post";
_pst = new b4a.example.post();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="pst.Initialize()";
_pst._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="json = \"{ 'id' : \" & id & \", 'title' : '\" & title";
_json = "{ 'id' : "+BA.NumberToString(_id)+", 'title' : '"+_title+"', 'content': '"+_content+"', 'userId': "+BA.NumberToString(_userid)+" }";
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="apiJob.PutString(ApiUrl & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="Wait For (apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "posts", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="Log(\"Error updating post: \" & resultado.ErrorMes";
parent.__c.LogImpl("513828110","Error updating post: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=13828113;
 //BA.debugLineNum = 13828113;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}