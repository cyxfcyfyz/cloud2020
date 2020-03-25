package com.fcy.service.impl;

import com.fcy.dao.PaymentDao;
import com.fcy.pojo.Payment;
import com.fcy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 19:59 2020/3/11
 * @Modified By:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
