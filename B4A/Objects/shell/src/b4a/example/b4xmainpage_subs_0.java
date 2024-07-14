package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 16;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Root = Root1";
Debug.ShouldStop(65536);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="apiUser.Initialize(\"https://apiusers-cmx9.onrende";
Debug.ShouldStop(262144);
__ref.getField(false,"_apiuser" /*RemoteObject*/ ).runClassMethod (b4a.example.users.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://apiusers-cmx9.onrender.com/api/Users")));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim apiUser As Users";
b4xmainpage._apiuser = RemoteObject.createNew ("b4a.example.users");__ref.setField("_apiuser",b4xmainpage._apiuser);
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private txt_id As EditText";
b4xmainpage._txt_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_id",b4xmainpage._txt_id);
 //BA.debugLineNum = 6;BA.debugLine="Private txt_username As EditText";
b4xmainpage._txt_username = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_username",b4xmainpage._txt_username);
 //BA.debugLineNum = 7;BA.debugLine="Private txt_password As EditText";
b4xmainpage._txt_password = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_password",b4xmainpage._txt_password);
 //BA.debugLineNum = 9;BA.debugLine="Public postPage As PostPage";
b4xmainpage._postpage = RemoteObject.createNew ("b4a.example.postpage");__ref.setField("_postpage",b4xmainpage._postpage);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmd_create_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_Create_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("cmd_create_click")) { __ref.runUserSub(false, "b4xmainpage","cmd_create_click", __ref); return;}
ResumableSub_cmd_Create_Click rsub = new ResumableSub_cmd_Create_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_Create_Click extends BA.ResumableSub {
public ResumableSub_cmd_Create_Click(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _usr = RemoteObject.declareNull("b4a.example.user");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_Create_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,71);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 72;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 73;BA.debugLine="Wait For (apiUser.Create(txt_username.Text, txt_";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "cmd_create_click"), __ref.getField(false,"_apiuser" /*RemoteObject*/ ).runClassMethod (b4a.example.users.class, "_create" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txt_username" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txt_password" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_usr = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("usr", _usr);
;
 BA.debugLineNum = 74;BA.debugLine="If usr <> Null And usr.id > 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_usr) && RemoteObject.solveBoolean(">",_usr.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 75;BA.debugLine="Msgbox(\"Usuario creado correctamente\", \"OK\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuario creado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 77;BA.debugLine="Msgbox(\"Username (min. 5 caracteres), Password";
Debug.ShouldStop(4096);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Username (min. 5 caracteres), Password (min. 8 caracteres)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 80;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _complete(RemoteObject __ref,RemoteObject _usr) throws Exception{
}
public static void  _cmd_delete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_Delete_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("cmd_delete_click")) { __ref.runUserSub(false, "b4xmainpage","cmd_delete_click", __ref); return;}
ResumableSub_cmd_Delete_Click rsub = new ResumableSub_cmd_Delete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_Delete_Click extends BA.ResumableSub {
public ResumableSub_cmd_Delete_Click(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_Delete_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 56;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 57;BA.debugLine="Wait For (apiUser.Delete(txt_id.Text)) Complete";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "cmd_delete_click"), __ref.getField(false,"_apiuser" /*RemoteObject*/ ).runClassMethod (b4a.example.users.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_id" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 58;BA.debugLine="If r Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 9;
if (_r.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 59;BA.debugLine="txt_id.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txt_id" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 60;BA.debugLine="txt_username.Text = \"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txt_username" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 61;BA.debugLine="txt_password.Text = \"\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txt_password" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 62;BA.debugLine="Msgbox(\"Usuario eliminado correctamente\", \"OK\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuario eliminado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"No se pudo eliminar el usuario\", \"Error";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo eliminar el usuario")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _cmd_gopost_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_goPost_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("cmd_gopost_click")) { return __ref.runUserSub(false, "b4xmainpage","cmd_gopost_click", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Private Sub cmd_goPost_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="If postPage.IsInitialized = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_postpage" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 86;BA.debugLine="postPage.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_postpage" /*RemoteObject*/ ).runClassMethod (b4a.example.postpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 87;BA.debugLine="B4XPages.AddPageAndCreate(\"postPage\",postPage)";
Debug.ShouldStop(4194304);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("postPage")),(Object)((__ref.getField(false,"_postpage" /*RemoteObject*/ ))));
 BA.debugLineNum = 88;BA.debugLine="B4XPages.ShowPage(\"postPage\")";
Debug.ShouldStop(8388608);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("postPage")));
 }else {
 BA.debugLineNum = 91;BA.debugLine="B4XPages.ShowPage(\"postPage\")";
Debug.ShouldStop(67108864);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("postPage")));
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cmd_readbyid_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_ReadById_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("cmd_readbyid_click")) { __ref.runUserSub(false, "b4xmainpage","cmd_readbyid_click", __ref); return;}
ResumableSub_cmd_ReadById_Click rsub = new ResumableSub_cmd_ReadById_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_ReadById_Click extends BA.ResumableSub {
public ResumableSub_cmd_ReadById_Click(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _usr = RemoteObject.declareNull("b4a.example.user");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_ReadById_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 23;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//try
this.state = 18;
this.catchState = 17;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 17;
 BA.debugLineNum = 24;BA.debugLine="Wait For (apiUser.Read_ById(txt_id.Text)) Comple";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "cmd_readbyid_click"), __ref.getField(false,"_apiuser" /*RemoteObject*/ ).runClassMethod (b4a.example.users.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_id" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_usr = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("usr", _usr);
;
 BA.debugLineNum = 25;BA.debugLine="If usr <> Null Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("N",_usr)) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 26;BA.debugLine="Log(usr)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","513172740",BA.ObjectToString(_usr),0);
 BA.debugLineNum = 27;BA.debugLine="If usr.id > 0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_usr.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 28;BA.debugLine="txt_username.Text = usr.username";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txt_username" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_usr.getField(true,"_username" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="txt_password.Text = usr.password";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txt_password" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_usr.getField(true,"_password" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="Msgbox(\"Usuario leído correctamente\", \"OK\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuario leído correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 32;BA.debugLine="Msgbox(\"No se pudo leer el usuario\", \"Error\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo leer el usuario")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 35;BA.debugLine="Msgbox(\"Error leyendo el usuario\", \"Error\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error leyendo el usuario")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 15:
//C
this.state = 18;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 38;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
Debug.ShouldStop(32);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _cmd_update_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_Update_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("cmd_update_click")) { __ref.runUserSub(false, "b4xmainpage","cmd_update_click", __ref); return;}
ResumableSub_cmd_Update_Click rsub = new ResumableSub_cmd_Update_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_Update_Click extends BA.ResumableSub {
public ResumableSub_cmd_Update_Click(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_Update_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 43;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 44;BA.debugLine="Wait For (apiUser.Update(txt_id.Text, txt_userna";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "cmd_update_click"), __ref.getField(false,"_apiuser" /*RemoteObject*/ ).runClassMethod (b4a.example.users.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_id" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txt_username" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txt_password" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 45;BA.debugLine="If r Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 9;
if (_r.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 46;BA.debugLine="Msgbox(\"Usuario actualizado correctamente\", \"OK";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuario actualizado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 48;BA.debugLine="Msgbox(\"No se pudo actualizar el usuario\", \"Err";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo actualizar el usuario")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
Debug.ShouldStop(262144);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}