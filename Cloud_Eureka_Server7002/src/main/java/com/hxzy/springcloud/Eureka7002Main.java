package com.hxzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yang.hu
 * @date 2020/6/6 下午10:28
 */

@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Main {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Main.class,args);
    }

}
