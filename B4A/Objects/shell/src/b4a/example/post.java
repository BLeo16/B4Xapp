
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class post {
    public static RemoteObject myClass;
	public post() {
	}
    public static PCBA staticBA = new PCBA(null, post.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _title = RemoteObject.createImmutable("");
public static RemoteObject _content = RemoteObject.createImmutable("");
public static RemoteObject _userid = RemoteObject.createImmutable(0);
public static RemoteObject _user = RemoteObject.declareNull("b4a.example.user");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"content",_ref.getField(false, "_content"),"id",_ref.getField(false, "_id"),"title",_ref.getField(false, "_title"),"userId",_ref.getField(false, "_userid")};
}
}