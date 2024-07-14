package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class postpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.postpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.postpage.class).invoke(this, new Object[] {null});
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
public b4a.example.posts _apipost = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_postid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_title = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_content = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_userid = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.postpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Return Me";
if (true) return BA.ObjectToString(this);
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.postpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Root.LoadLayout(\"PostLayout\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PostLayout",ba);
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="apiPost.Initialize(\"https://apiusers-cmx9.onrende";
__ref._apipost /*b4a.example.posts*/ ._initialize /*String*/ (null,ba,"https://apiusers-cmx9.onrender.com/api/Posts");
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.postpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="postpage";
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Dim apiPost As Posts";
_apipost = new b4a.example.posts();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="Private txt_postId As EditText";
_txt_postid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="Private txt_title As EditText";
_txt_title = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="Private txt_content As EditText";
_txt_content = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Private txt_userId As EditText";
_txt_userid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="End Sub";
return "";
}
public void  _cmd_createpost_click(b4a.example.postpage __ref) throws Exception{
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "cmd_createpost_click", false))
	 {Debug.delegate(ba, "cmd_createpost_click", null); return;}
ResumableSub_cmd_CreatePost_Click rsub = new ResumableSub_cmd_CreatePost_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_CreatePost_Click extends BA.ResumableSub {
public ResumableSub_cmd_CreatePost_Click(b4a.example.postpage parent,b4a.example.postpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.postpage __ref;
b4a.example.postpage parent;
b4a.example.post _post = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="postpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Try";
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
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Wait For (apiPost.Create(txt_title.Text, txt_con";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "postpage", "cmd_createpost_click"), __ref._apipost /*b4a.example.posts*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._txt_title /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txt_content /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txt_userid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_post = (b4a.example.post) result[1];
;
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="If post <> Null And post.id > 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_post!= null && _post._id /*int*/ >0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="Msgbox(\"Post creado correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Post creado correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="Msgbox(\"No se pudo crear el post\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo crear el post"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _cmd_deletepost_click(b4a.example.postpage __ref) throws Exception{
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "cmd_deletepost_click", false))
	 {Debug.delegate(ba, "cmd_deletepost_click", null); return;}
ResumableSub_cmd_DeletePost_Click rsub = new ResumableSub_cmd_DeletePost_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_DeletePost_Click extends BA.ResumableSub {
public ResumableSub_cmd_DeletePost_Click(b4a.example.postpage parent,b4a.example.postpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.postpage __ref;
b4a.example.postpage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="postpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Try";
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
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Wait For (apiPost.Delete(txt_postId.Text)) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "postpage", "cmd_deletepost_click"), __ref._apipost /*b4a.example.posts*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txt_postid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="If r Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_r) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="txt_postId.Text = \"\"";
__ref._txt_postid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="txt_title.Text = \"\"";
__ref._txt_title /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="txt_content.Text = \"\"";
__ref._txt_content /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="txt_userId.Text = \"\"";
__ref._txt_userid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="Msgbox(\"Post eliminado correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Post eliminado correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="Msgbox(\"No se pudo eliminar el post\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo eliminar el post"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14352397;
 //BA.debugLineNum = 14352397;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14352399;
 //BA.debugLineNum = 14352399;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _cmd_readpostbyid_click(b4a.example.postpage __ref) throws Exception{
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "cmd_readpostbyid_click", false))
	 {Debug.delegate(ba, "cmd_readpostbyid_click", null); return;}
ResumableSub_cmd_ReadPostById_Click rsub = new ResumableSub_cmd_ReadPostById_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_ReadPostById_Click extends BA.ResumableSub {
public ResumableSub_cmd_ReadPostById_Click(b4a.example.postpage parent,b4a.example.postpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.postpage __ref;
b4a.example.postpage parent;
b4a.example.post _post = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="postpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Try";
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
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Wait For (apiPost.Read_ById(txt_postId.Text)) Co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "postpage", "cmd_readpostbyid_click"), __ref._apipost /*b4a.example.posts*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txt_postid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_post = (b4a.example.post) result[1];
;
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="If post <> Null Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_post!= null) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Log(post)";
parent.__c.LogImpl("514221316",BA.ObjectToString(_post),0);
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="If post.id > 0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_post._id /*int*/ >0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="txt_title.Text = post.title";
__ref._txt_title /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_post._title /*String*/ ));
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="txt_content.Text = post.content";
__ref._txt_content /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_post._content /*String*/ ));
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="txt_userId.Text = post.userId";
__ref._txt_userid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_post._userid /*int*/ ));
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="Msgbox(\"Post leído correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Post leído correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=14221323;
 //BA.debugLineNum = 14221323;BA.debugLine="Msgbox(\"No se pudo leer el post\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo leer el post"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=14221326;
 //BA.debugLineNum = 14221326;BA.debugLine="Msgbox(\"Error leyendo el post\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error leyendo el post"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=14221329;
 //BA.debugLineNum = 14221329;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _cmd_updatepost_click(b4a.example.postpage __ref) throws Exception{
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "cmd_updatepost_click", false))
	 {Debug.delegate(ba, "cmd_updatepost_click", null); return;}
ResumableSub_cmd_UpdatePost_Click rsub = new ResumableSub_cmd_UpdatePost_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_UpdatePost_Click extends BA.ResumableSub {
public ResumableSub_cmd_UpdatePost_Click(b4a.example.postpage parent,b4a.example.postpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.postpage __ref;
b4a.example.postpage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="postpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Try";
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
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Wait For (apiPost.Update(txt_postId.Text, txt_ti";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "postpage", "cmd_updatepost_click"), __ref._apipost /*b4a.example.posts*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txt_postid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txt_title /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txt_content /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txt_userid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="If r Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_r) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Msgbox(\"Post actualizado correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Post actualizado correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="Msgbox(\"No se pudo actualizar el post\", \"Error\"";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo actualizar el post"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _cmdbackpage_click(b4a.example.postpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="postpage";
if (Debug.shouldDelegate(ba, "cmdbackpage_click", false))
	 {return ((String) Debug.delegate(ba, "cmdbackpage_click", null));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub cmdBackPage_Click";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return "";
}
}