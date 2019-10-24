package org.xujin.halo.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.when;

/**
 *
 * HaloMock
 * @author xujin
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({NotificationUtil.class})
public class HaloPowerMockTest {

	@Before
	public void init() {
		MockitoAnnotations.initMocks(NotificationUtil.class);
	}

	/**
	 * 测试静态方法
	 */
	@Test
	public void testStaticMethod() {
		// Given
		String emailid = "Software_King@qq.com";
		PowerMockito.mockStatic(NotificationUtil.class);
		// When
		when(NotificationUtil.sendEmail(emailid)).thenReturn("success");
	}

}
