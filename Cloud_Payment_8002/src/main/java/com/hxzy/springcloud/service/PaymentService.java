package com.hxzy.springcloud.service;


import com.hxzy.springcloud.entity.Payment;

/**
 * @author Yang.hu
 * @date 2020/6/5 下午8:43
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment findPaymentById(long paymentId);

}
