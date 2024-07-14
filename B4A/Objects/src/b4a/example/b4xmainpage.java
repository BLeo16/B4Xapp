package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public b4a.example.users _apiuser = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_id = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_username = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_password = null;
public b4a.example.postpage _postpage = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created(Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="apiUser.Initialize(\"https://apiusers-cmx9.onrende";
__ref._apiuser /*b4a.example.users*/ ._initialize /*String*/ (null,ba,"https://apiusers-cmx9.onrender.com/api/Users");
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim apiUser As Users";
_apiuser = new b4a.example.users();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private txt_id As EditText";
_txt_id = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private txt_username As EditText";
_txt_username = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private txt_password As EditText";
_txt_password = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Public postPage As PostPage";
_postpage = new b4a.example.postpage();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="End Sub";
return "";
}
public void  _cmd_create_click(b4a.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmd_create_click", false))
	 {Debug.delegate(ba, "cmd_create_click", null); return;}
ResumableSub_cmd_Create_Click rsub = new ResumableSub_cmd_Create_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_Create_Click extends BA.ResumableSub {
public ResumableSub_cmd_Create_Click(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
b4a.example.user _usr = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Try";
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
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Wait For (apiUser.Create(txt_username.Text, txt_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "cmd_create_click"), __ref._apiuser /*b4a.example.users*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._txt_username /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txt_password /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_usr = (b4a.example.user) result[1];
;
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="If usr <> Null And usr.id > 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_usr!= null && _usr._id /*int*/ >0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Msgbox(\"Usuario creado correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Usuario creado correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Msgbox(\"Username (min. 5 caracteres), Password";
parent.__c.Msgbox(BA.ObjectToCharSequence("Username (min. 5 caracteres), Password (min. 8 caracteres)"),BA.ObjectToCharSequence("Error"),ba);
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
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="End Sub";
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
public void  _cmd_delete_click(b4a.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmd_delete_click", false))
	 {Debug.delegate(ba, "cmd_delete_click", null); return;}
ResumableSub_cmd_Delete_Click rsub = new ResumableSub_cmd_Delete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_Delete_Click extends BA.ResumableSub {
public ResumableSub_cmd_Delete_Click(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Try";
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
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Wait For (apiUser.Delete(txt_id.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "cmd_delete_click"), __ref._apiuser /*b4a.example.users*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txt_id /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="If r Then";
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
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="txt_id.Text = \"\"";
__ref._txt_id /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="txt_username.Text = \"\"";
__ref._txt_username /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="txt_password.Text = \"\"";
__ref._txt_password /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="Msgbox(\"Usuario eliminado correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Usuario eliminado correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="Msgbox(\"No se pudo eliminar el usuario\", \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo eliminar el usuario"),BA.ObjectToCharSequence("Error"),ba);
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
RDebugUtils.currentLine=13303820;
 //BA.debugLineNum = 13303820;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13303822;
 //BA.debugLineNum = 13303822;BA.debugLine="End Sub";
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
public String  _cmd_gopost_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmd_gopost_click", false))
	 {return ((String) Debug.delegate(ba, "cmd_gopost_click", null));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub cmd_goPost_Click";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="If postPage.IsInitialized = False Then";
if (__ref._postpage /*b4a.example.postpage*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="postPage.Initialize";
__ref._postpage /*b4a.example.postpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="B4XPages.AddPageAndCreate(\"postPage\",postPage)";
_b4xpages._addpageandcreate /*String*/ (ba,"postPage",(Object)(__ref._postpage /*b4a.example.postpage*/ ));
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="B4XPages.ShowPage(\"postPage\")";
_b4xpages._showpage /*String*/ (ba,"postPage");
 }else {
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="B4XPages.ShowPage(\"postPage\")";
_b4xpages._showpage /*String*/ (ba,"postPage");
 };
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="End Sub";
return "";
}
public void  _cmd_readbyid_click(b4a.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmd_readbyid_click", false))
	 {Debug.delegate(ba, "cmd_readbyid_click", null); return;}
ResumableSub_cmd_ReadById_Click rsub = new ResumableSub_cmd_ReadById_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_ReadById_Click extends BA.ResumableSub {
public ResumableSub_cmd_ReadById_Click(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
b4a.example.user _usr = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Try";
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
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Wait For (apiUser.Read_ById(txt_id.Text)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "cmd_readbyid_click"), __ref._apiuser /*b4a.example.users*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txt_id /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_usr = (b4a.example.user) result[1];
;
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="If usr <> Null Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_usr!= null) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="Log(usr)";
parent.__c.LogImpl("513172740",BA.ObjectToString(_usr),0);
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="If usr.id > 0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_usr._id /*int*/ >0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="txt_username.Text = usr.username";
__ref._txt_username /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_usr._username /*String*/ ));
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="txt_password.Text = usr.password";
__ref._txt_password /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_usr._password /*String*/ ));
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="Msgbox(\"Usuario leído correctamente\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Usuario leído correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="Msgbox(\"No se pudo leer el usuario\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo leer el usuario"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="Msgbox(\"Error leyendo el usuario\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error leyendo el usuario"),BA.ObjectToCharSequence("Error"),ba);
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
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="End Sub";
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
public void  _cmd_update_click(b4a.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmd_update_click", false))
	 {Debug.delegate(ba, "cmd_update_click", null); return;}
ResumableSub_cmd_Update_Click rsub = new ResumableSub_cmd_Update_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmd_Update_Click extends BA.ResumableSub {
public ResumableSub_cmd_Update_Click(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Try";
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
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Wait For (apiUser.Update(txt_id.Text, txt_userna";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "cmd_update_click"), __ref._apiuser /*b4a.example.users*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txt_id /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txt_username /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txt_password /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="If r Then";
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
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Msgbox(\"Usuario actualizado correctamente\", \"OK";
parent.__c.Msgbox(BA.ObjectToCharSequence("Usuario actualizado correctamente"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="Msgbox(\"No se pudo actualizar el usuario\", \"Err";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo actualizar el usuario"),BA.ObjectToCharSequence("Error"),ba);
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
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Msgbox(\"Error: \" & LastException.Message, \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="End Sub";
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
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="End Sub";
return "";
}
}