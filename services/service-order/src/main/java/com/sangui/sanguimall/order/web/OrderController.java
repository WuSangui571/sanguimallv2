package com.sangui.sanguimall.order.web;


import com.sangui.sanguimall.order.service.OrderService;
import com.sangui.sanguimall.result.R;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: 商品 Controller
 * @Version: 1.0
 */
@RestController
public class OrderController {
    @Resource
    OrderService orderService;

    @GetMapping("/orders")
    public R getProducts(){
        return R.ok(orderService.getAllOrders());
    }
}
