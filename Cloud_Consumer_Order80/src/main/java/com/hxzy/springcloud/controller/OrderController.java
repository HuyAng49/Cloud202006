package com.hxzy.springcloud.controller;

import com.hxzy.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.hxzy.springcloud.result.CommonResult;

import javax.annotation.Resource;

/**
 * @author Yang.hu
 * @date 2020/6/6 下午7:26
 */

@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/create",payment,CommonResult.class);
    }

    @GetMapping("/find/{id}")
    public CommonResult<Payment> findPayment(@PathVariable("id")long id){
        return restTemplate.getForObject(PAYMENT_URL+"/find/"+id,CommonResult.class);
    }

}
