package org.xujin.halo.mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.doReturn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import org.xujin.halo.mock.dto.OrderRequest;
import org.xujin.halo.mock.dto.OrderResponse;
import org.xujin.halo.mock.service.OrderServiceImpl;
import org.xujin.halo.mock.util.NotificationUtil;

/**
 *
 * HaloMock
 * @author xujin
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "org.xujin.halo.mock.*")
public class HaloPowerMockTest {

	@InjectMocks
	private OrderServiceImpl service;

	private static OrderRequest request;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(NotificationUtil.class);
		request= new OrderRequest(111, "Mobile", 1, 10000, "Software_King@qq.com", true);
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
		// Then
		OrderResponse response = service.checkOutOrder(request);
		assertEquals("success", response.getMessage());
	}


	/**
	 * 测试依赖注入的Service
	 */
	@Test
	public void testAutowiredService() {
		OrderResponse response = service.checkOutOrder(request);
		assertEquals("success", response.getMessage());
	}

	@Test
	public void testPrivateMethod() throws Exception {
		// When
		OrderServiceImpl spy = PowerMockito.spy(service);
		doReturn(2000).when(spy, "addDiscount", ArgumentMatchers.any());
		// Then
		OrderResponse response = spy.checkOutOrder(request);
		// 9000
		int price = response.getResponse().getPrice();
		System.out.println("price : " + price);
		assertEquals(8000, price);
	}

}
