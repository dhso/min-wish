/**
 * 
 */
/**
 * @author hadong
 *
 */
package com.minws.wish.page;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.minws.wish.frame.kit.ProsMap;
import com.minws.wish.frame.sdk.qiniu.QiniuKit;

public class PageController extends Controller {
	public void index() {
		
		render("index.jsp");
		return;
	}
	
	public void upload(){
		UploadFile uf =  getFile();
		System.out.print(uf.getFileName());
		QiniuKit.put(ProsMap.getStrPro("wish.qiniu.bucket"), uf.getFileName(), uf.getFile());
	}
}