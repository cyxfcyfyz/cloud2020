package com.fcy.dao;

import com.fcy.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 18:49 2020/3/11
 * @Modified By:
 */
@Mapper
public interface PaymentDao {


   public int create(Payment payment);

   public Payment getPaymentById(@Param("id") Long id);

}
