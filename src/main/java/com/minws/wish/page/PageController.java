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
		
		render("index.jsp");
		return;
	}
}