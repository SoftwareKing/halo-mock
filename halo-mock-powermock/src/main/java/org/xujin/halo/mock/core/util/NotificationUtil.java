package org.xujin.halo.mock.core.util;

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
