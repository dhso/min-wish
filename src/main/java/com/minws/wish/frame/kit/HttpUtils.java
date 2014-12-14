package com.minws.wish.frame.kit;

import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtils extends org.apache.commons.lang3.StringUtils {

	/**
	 * 获得用户远程地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getRemoteAddr(HttpServletRequest request) {
		String remoteAddr = request.getHeader("X-Real-IP");
		if (isNotBlank(remoteAddr)) {
			remoteAddr = request.getHeader("X-Forwarded-For");
		} else if (isNotBlank(remoteAddr)) {
			remoteAddr = request.getHeader("Proxy-Client-IP");
		} else if (isNotBlank(remoteAddr)) {
			remoteAddr = request.getHeader("WL-Proxy-Client-IP");
		}
		return remoteAddr != null ? remoteAddr : request.getRemoteAddr();
	}

	public static String httpGet(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse response = null;
		RequestConfig requestconfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).setCookieSpec(CookieSpecs.BEST_MATCH).build();
		httpget.setConfig(requestconfig);
		response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		String str = null;
		if (entity != null) {
			InputStream instreams = entity.getContent();
			str = StringUtils.convertStreamToString(instreams);
			try {
				instreams.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return str;
	}

	public static <T> T httpGetClazz(String url, Class<T> t) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse response = null;
		RequestConfig requestconfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).setCookieSpec(CookieSpecs.BEST_MATCH).build();
		httpget.setConfig(requestconfig);
		response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		String str = null;
		T tClass = null;
		if (entity != null) {
			InputStream instreams = entity.getContent();
			str = StringUtils.convertStreamToString(instreams);
			ObjectMapper mapper = new ObjectMapper();
			tClass = mapper.convertValue(str, t);
			try {
				instreams.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return tClass;
	}

	public static void proxy() {
		Properties prop = System.getProperties();
		prop.put("http.proxySet", "true");
		prop.setProperty("http.proxyHost", "proxy.ace.aliyun.com");
		prop.setProperty("http.proxyPort", "3128");
		prop.setProperty("https.proxyHost", "proxy.ace.aliyun.com");
		prop.setProperty("https.proxyPort", "3128");
		//prop.setProperty("socksProxyHost", "proxy.ace.aliyun.com");
        //prop.setProperty("socksProxyPort", "3128");
		Authenticator.setDefault(new MyAuthenticator("1194709104218733_default_-6", "rb6e475twf"));
		System.out.println("====proxy=======");
	}

	static class MyAuthenticator extends Authenticator {
		private String user = "";
		private String password = "";

		public MyAuthenticator(String user, String password) {
			this.user = user;
			this.password = password;
		}

		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(user, password.toCharArray());
		}
	}
}
