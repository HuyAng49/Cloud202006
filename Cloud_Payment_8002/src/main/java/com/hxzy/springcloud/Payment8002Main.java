package com.hxzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yang.hu
 * @date 2020/6/5 下午9:46
 */

@SpringBootApplication
@EnableEurekaClient
public class Payment8002Main {

    public static void main(String[] args) {
        SpringApplication.run(Payment8002Main.class,args);
    }

}
