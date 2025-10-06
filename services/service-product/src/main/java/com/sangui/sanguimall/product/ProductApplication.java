package com.sangui.sanguimall.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: 产品主入口程序
 * @Version: 1.0
 */
@MapperScan("com.sangui.sanguimall.product.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
