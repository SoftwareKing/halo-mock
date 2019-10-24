package org.xujin.halo.mock.core.service;

import org.xujin.halo.mock.core.dto.OrderRequest;
import org.xujin.halo.mock.core.dto.OrderResponse;

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
