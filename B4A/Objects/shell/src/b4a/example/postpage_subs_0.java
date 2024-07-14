package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class postpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "postpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"PostLayout\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PostLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="apiPost.Initialize(\"https://apiusers-cmx9.onrende";
Debug.ShouldStop(131072);
__ref.getField(false,"_apipost" /*RemoteObject*/ ).runClassMethod (b4a.example.posts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://apiusers-cmx9.onrender.com/api/Posts")));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
 //BA.debugLineNum = 2;BA.debugLine="Dim apiPost As Posts";
postpage._apipost = RemoteObject.createNew ("b4a.example.posts");__ref.setField("_apipost",postpage._apipost);
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
postpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",postpage._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
postpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",postpage._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private txt_postId As EditText";
postpage._txt_postid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_postid",postpage._txt_postid);
 //BA.debugLineNum = 6;BA.debugLine="Private txt_title As EditText";
postpage._txt_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_title",postpage._txt_title);
 //BA.debugLineNum = 7;BA.debugLine="Private txt_content As EditText";
postpage._txt_content = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_content",postpage._txt_content);
 //BA.debugLineNum = 8;BA.debugLine="Private txt_userId As EditText";
postpage._txt_userid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txt_userid",postpage._txt_userid);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmd_createpost_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_CreatePost_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("cmd_createpost_click")) { __ref.runUserSub(false, "postpage","cmd_createpost_click", __ref); return;}
ResumableSub_cmd_CreatePost_Click rsub = new ResumableSub_cmd_CreatePost_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_CreatePost_Click extends BA.ResumableSub {
public ResumableSub_cmd_CreatePost_Click(b4a.example.postpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.postpage parent;
RemoteObject _post = RemoteObject.declareNull("b4a.example.post");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_CreatePost_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,72);
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
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 74;BA.debugLine="Wait For (apiPost.Create(txt_title.Text, txt_con";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "postpage", "cmd_createpost_click"), __ref.getField(false,"_apipost" /*RemoteObject*/ ).runClassMethod (b4a.example.posts.class, "_create" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txt_title" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txt_content" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_userid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_post = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("post", _post);
;
 BA.debugLineNum = 75;BA.debugLine="If post <> Null And post.id > 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_post) && RemoteObject.solveBoolean(">",_post.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 76;BA.debugLine="Msgbox(\"Post creado correctamente\", \"OK\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Post creado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"No se pudo crear el post\", \"Error\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el post")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
 BA.debugLineNum = 81;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
Debug.ShouldStop(65536);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static void  _complete(RemoteObject __ref,RemoteObject _post) throws Exception{
}
public static void  _cmd_deletepost_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_DeletePost_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("cmd_deletepost_click")) { __ref.runUserSub(false, "postpage","cmd_deletepost_click", __ref); return;}
ResumableSub_cmd_DeletePost_Click rsub = new ResumableSub_cmd_DeletePost_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_DeletePost_Click extends BA.ResumableSub {
public ResumableSub_cmd_DeletePost_Click(b4a.example.postpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.postpage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_DeletePost_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,55);
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
 BA.debugLineNum = 57;BA.debugLine="Wait For (apiPost.Delete(txt_postId.Text)) Compl";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "postpage", "cmd_deletepost_click"), __ref.getField(false,"_apipost" /*RemoteObject*/ ).runClassMethod (b4a.example.posts.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_postid" /*RemoteObject*/ ).runMethod(true,"getText")))));
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
 BA.debugLineNum = 59;BA.debugLine="txt_postId.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txt_postid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 60;BA.debugLine="txt_title.Text = \"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txt_title" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 61;BA.debugLine="txt_content.Text = \"\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txt_content" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 62;BA.debugLine="txt_userId.Text = \"\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txt_userid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 63;BA.debugLine="Msgbox(\"Post eliminado correctamente\", \"OK\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Post eliminado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 65;BA.debugLine="Msgbox(\"No se pudo eliminar el post\", \"Error\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo eliminar el post")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
 BA.debugLineNum = 68;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
Debug.ShouldStop(8);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _cmd_readpostbyid_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_ReadPostById_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("cmd_readpostbyid_click")) { __ref.runUserSub(false, "postpage","cmd_readpostbyid_click", __ref); return;}
ResumableSub_cmd_ReadPostById_Click rsub = new ResumableSub_cmd_ReadPostById_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_ReadPostById_Click extends BA.ResumableSub {
public ResumableSub_cmd_ReadPostById_Click(b4a.example.postpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.postpage parent;
RemoteObject _post = RemoteObject.declareNull("b4a.example.post");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_ReadPostById_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,21);
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
 BA.debugLineNum = 22;BA.debugLine="Try";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 23;BA.debugLine="Wait For (apiPost.Read_ById(txt_postId.Text)) Co";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "postpage", "cmd_readpostbyid_click"), __ref.getField(false,"_apipost" /*RemoteObject*/ ).runClassMethod (b4a.example.posts.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_postid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_post = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("post", _post);
;
 BA.debugLineNum = 24;BA.debugLine="If post <> Null Then";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("N",_post)) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 25;BA.debugLine="Log(post)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","514221316",BA.ObjectToString(_post),0);
 BA.debugLineNum = 26;BA.debugLine="If post.id > 0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_post.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 27;BA.debugLine="txt_title.Text = post.title";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txt_title" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_post.getField(true,"_title" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="txt_content.Text = post.content";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txt_content" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_post.getField(true,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="txt_userId.Text = post.userId";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txt_userid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_post.getField(true,"_userid" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="Msgbox(\"Post leído correctamente\", \"OK\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Post leído correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 32;BA.debugLine="Msgbox(\"No se pudo leer el post\", \"Error\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo leer el post")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 35;BA.debugLine="Msgbox(\"Error leyendo el post\", \"Error\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error leyendo el post")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
public static void  _cmd_updatepost_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmd_UpdatePost_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("cmd_updatepost_click")) { __ref.runUserSub(false, "postpage","cmd_updatepost_click", __ref); return;}
ResumableSub_cmd_UpdatePost_Click rsub = new ResumableSub_cmd_UpdatePost_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmd_UpdatePost_Click extends BA.ResumableSub {
public ResumableSub_cmd_UpdatePost_Click(b4a.example.postpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.postpage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmd_UpdatePost_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,42);
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
 BA.debugLineNum = 44;BA.debugLine="Wait For (apiPost.Update(txt_postId.Text, txt_ti";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "postpage", "cmd_updatepost_click"), __ref.getField(false,"_apipost" /*RemoteObject*/ ).runClassMethod (b4a.example.posts.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_postid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txt_title" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txt_content" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txt_userid" /*RemoteObject*/ ).runMethod(true,"getText")))));
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
 BA.debugLineNum = 46;BA.debugLine="Msgbox(\"Post actualizado correctamente\", \"OK\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Post actualizado correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 48;BA.debugLine="Msgbox(\"No se pudo actualizar el post\", \"Error\"";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo actualizar el post")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
public static RemoteObject  _cmdbackpage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdBackPage_Click (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("cmdbackpage_click")) { return __ref.runUserSub(false, "postpage","cmdbackpage_click", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Private Sub cmdBackPage_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2097152);
postpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (postpage) ","postpage",7,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "postpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Return Me";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString(__ref);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}