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
public class Payment8001Main {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001Main.class,args);
    }

}
