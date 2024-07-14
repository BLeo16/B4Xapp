
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class postpage {
    public static RemoteObject myClass;
	public postpage() {
	}
    public static PCBA staticBA = new PCBA(null, postpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _apipost = RemoteObject.declareNull("b4a.example.posts");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txt_postid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_title = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_content = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_userid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiPost",_ref.getField(false, "_apipost"),"Root",_ref.getField(false, "_root"),"txt_content",_ref.getField(false, "_txt_content"),"txt_postId",_ref.getField(false, "_txt_postid"),"txt_title",_ref.getField(false, "_txt_title"),"txt_userId",_ref.getField(false, "_txt_userid"),"xui",_ref.getField(false, "_xui")};
}
}