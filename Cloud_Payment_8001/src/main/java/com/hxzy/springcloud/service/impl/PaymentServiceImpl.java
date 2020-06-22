package com.hxzy.springcloud.service.impl;

import com.hxzy.springcloud.dao.PaymentDao;
import com.hxzy.springcloud.service.PaymentService;
import com.hxzy.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yang.hu
 * @date 2020/6/5 下午8:46
 */

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired(required = false)
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        int result = paymentDao.insert(payment);
        return result;
    }

    @Override
    public Payment findPaymentById(long paymentId) {
        return paymentDao.selectByPrimaryKey(paymentId);
    }
}
