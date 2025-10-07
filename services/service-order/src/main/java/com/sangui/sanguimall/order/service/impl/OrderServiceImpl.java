package com.sangui.sanguimall.order.service.impl;


import com.sangui.sanguimall.order.mapper.OmsOrderMapper;
import com.sangui.sanguimall.order.model.OmsOrder;
import com.sangui.sanguimall.order.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: OrderServiceImpl
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OmsOrderMapper orderMapper;

    @Override
    public List<OmsOrder> getAllOrders() {
        return orderMapper.selectAll();
    }
}
