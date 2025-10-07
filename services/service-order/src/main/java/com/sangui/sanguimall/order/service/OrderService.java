package com.sangui.sanguimall.order.service;


import com.sangui.sanguimall.order.model.OmsOrder;

import java.util.List;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: OrderService
 * @Version: 1.0
 */
public interface OrderService {
    List<OmsOrder> getAllOrders();
}
