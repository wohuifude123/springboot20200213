package com.spring.inter.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring boot 入口启动程序，sprint boot内置了tomcat
 * @author Administrator
 */

@ComponentScan(basePackages= {"com.spring.inter.controller"})//扫描组件
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}