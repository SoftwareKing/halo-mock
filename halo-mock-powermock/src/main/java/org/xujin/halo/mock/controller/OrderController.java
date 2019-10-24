package org.xujin.halo.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.halo.mock.dto.OrderRequest;
import org.xujin.halo.mock.dto.OrderResponse;
import org.xujin.halo.mock.service.OrderService;

/**
 * 订单测试Controller
 * @author xujin
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/placeOrder")
    public OrderResponse placeOrder(@RequestBody OrderRequest request){
        return service.checkOutOrder(request);
    }

}
