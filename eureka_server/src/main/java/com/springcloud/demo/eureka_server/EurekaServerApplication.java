package com.springcloud.demo.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: Spring Cloud Demo
 * @description:Eureka服务注册中心
 * @author: ZhaoZhao.Yu
 * @date: 2019/3/4 9:02
 * @version: 1.0
 * @Copyright: iSoftstone Tech. Co. Ltd. All Rights Reserved
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
