package com.sangui.sanguimall.coupon;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: 优惠券主入口程序
 * @Version: 1.0
 */

//@EnableTransactionManagement
@MapperScan("com.sangui.sanguimall.coupon.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }
}
