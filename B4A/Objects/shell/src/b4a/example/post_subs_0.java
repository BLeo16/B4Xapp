package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class post_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public id As Int";
post._id = RemoteObject.createImmutable(0);__ref.setField("_id",post._id);
 //BA.debugLineNum = 3;BA.debugLine="Public title As String";
post._title = RemoteObject.createImmutable("");__ref.setField("_title",post._title);
 //BA.debugLineNum = 4;BA.debugLine="Public content As String";
post._content = RemoteObject.createImmutable("");__ref.setField("_content",post._content);
 //BA.debugLineNum = 5;BA.debugLine="Public userId As Int";
post._userid = RemoteObject.createImmutable(0);__ref.setField("_userid",post._userid);
 //BA.debugLineNum = 6;BA.debugLine="Public User As User";
post._user = RemoteObject.createNew ("b4a.example.user");__ref.setField("_user",post._user);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (post) ","post",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "post","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}