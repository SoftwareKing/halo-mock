package org.xujin.halo.mock.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 模拟订单请求的返回值
 * @author xujin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse {
	private OrderRequest response;
	private String message;
	private int statusCode;

}
