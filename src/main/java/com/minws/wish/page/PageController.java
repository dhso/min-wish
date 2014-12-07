/**
 * 
 */
/**
 * @author hadong
 *
 */
package com.minws.wish.page;

import java.io.Serializable;

import com.jfinal.core.Controller;
import com.minws.wish.frame.sdk.qqConnect.QQUserInfo;
import com.minws.wish.frame.util.AceUtils;

public class PageController extends Controller {
	public void index() {
		String sso_access_token = getCookie("sso_access_token", "");
		Serializable ser = AceUtils.cacheGet(sso_access_token);
		QQUserInfo qquerInfo = (null != ser) ? (QQUserInfo) ser : null;
		setAttr("qquerInfo", qquerInfo);
		render("index.jsp");
		return;
	}
}