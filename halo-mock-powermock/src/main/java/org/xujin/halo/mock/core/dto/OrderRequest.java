package org.xujin.halo.mock.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 模拟订单请求
 * @author xujin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

	private int id;
	private String name;
	private int quantity;
	private int price;
	private String emailId;
	private boolean isDiscountable;

}
