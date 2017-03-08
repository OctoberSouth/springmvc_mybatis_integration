package lp;

import java.net.URLEncoder;

import lp.utils.EncryptUtils;
import lp.utils.HttpRequest;

public class TestMain {
	public static void main(String[] args) {
		String pro = null;
		try {
			pro = "fields=" + URLEncoder.encode(EncryptUtils.aesEncrypt("/testController/tese.json?id=1"), "utf-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(HttpRequest.sendPost("http://127.0.0.1/mainController/mainForward", pro));
		
//		System.err.println(StringUtils.substringBefore("/testController/tese.json?id=2", "?"));
	}
}
