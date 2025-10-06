package com.sangui.sanguimall.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: 库存主入口程序
 * @Version: 1.0
 */
@MapperScan("com.sangui.sanguimall.ware.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class WareApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class, args);
    }
}


