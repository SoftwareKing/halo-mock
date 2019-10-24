package org.xujin.halo.mock;

/**
 * 模拟通知util
 * @author xujin
 */
public class NotificationUtil {

	public static String sendEmail(String email) {
		System.out.println("-------sendEmail:"+email);
		return "success";
	}

}
