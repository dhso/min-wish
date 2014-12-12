/**
 * @author hadong
 *
 */
package com.minws.wish.frame.sdk.qiniu;

import org.json.JSONException;

import com.jfinal.log.Logger;
import com.minws.wish.frame.kit.properties.ProsMap;
import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.rs.PutPolicy;
import com.qiniu.api.rs.RSClient;
import com.qiniu.api.rsf.RSFClient;

public class QiniuConfig {
	private static final Logger logger = Logger.getLogger(QiniuConfig.class);

	private String ak = ProsMap.getStrPro("wish.qiniu.ak");
	private String sk = ProsMap.getStrPro("wish.qiniu.sk");

	public String getToken(String bucketName) {
		Mac mac = new Mac(ak, sk);
		PutPolicy putPolicy = new PutPolicy(bucketName);
		try {
			return putPolicy.token(mac);
		} catch (JSONException e) {
			logger.error("qiniu config get token", e);
		} catch (AuthException e) {
			logger.error("qiniu config get token", e);
		}
		return null;
	}

	public RSFClient getRSFClient() {
		Mac mac = new Mac(ak, sk);
		RSFClient client = new RSFClient(mac);
		return client;
	}

	public RSClient getRSClient() {
		Mac mac = new Mac(ak, sk);
		RSClient client = new RSClient(mac);
		return client;
	}

}