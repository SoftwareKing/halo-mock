package org.xujin.halo.mock.service;

import org.xujin.halo.mock.dto.OrderRequest;
import org.xujin.halo.mock.dto.OrderResponse;

/**
 * 支付订单Service
 * @author xujin
 */
public interface OrderService {

    /**
     * 支付订单
     * @param order
     * @return
     */
    OrderResponse checkOutOrder(OrderRequest order);

}
