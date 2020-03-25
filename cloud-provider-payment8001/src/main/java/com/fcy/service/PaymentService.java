package com.fcy.service;

import com.fcy.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 19:58 2020/3/11
 * @Modified By:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

    public Payment queryBacterial(@Param("serial") String serial);

}
