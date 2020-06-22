package com.hxzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yang.hu
 * @date 2020/6/6 下午9:34
 */

@SpringBootApplication
@EnableEurekaServer
public class Eureka7001Main {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Main.class,args);
    }

}
