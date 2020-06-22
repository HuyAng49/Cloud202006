package com.hxzy.springcloud.controller;

import com.hxzy.springcloud.service.PaymentService;
import com.hxzy.springcloud.entity.Payment;
import com.hxzy.springcloud.eunms.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.hxzy.springcloud.result.CommonResult;

/**
 * @author Yang.hu
 * @date 2020/6/5 下午8:49
 */

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if (result>0){
            return new CommonResult(ResultEnum.SUCCESSFUL_OPERATION,serverPort,result);
        }else {
            return new CommonResult(ResultEnum.FAILED_OPERATION,serverPort,null);
        }
    }

    @GetMapping("/find/{id}")
    public CommonResult<Payment> findById(@PathVariable("id")long id){
        Payment payment = paymentService.findPaymentById(id);

        if (payment != null){
            return new CommonResult(ResultEnum.SUCCESSFUL_OPERATION,serverPort,payment);
        }else {
            return new CommonResult(ResultEnum.FAILED_OPERATION,serverPort,null);
        }
    }

}
