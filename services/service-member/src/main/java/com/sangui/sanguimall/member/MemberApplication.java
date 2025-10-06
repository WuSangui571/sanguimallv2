package com.sangui.sanguimall.member;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: member 主入口程序
 * @Version: 1.0
 */
@MapperScan("com.sangui.sanguimall.member.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
