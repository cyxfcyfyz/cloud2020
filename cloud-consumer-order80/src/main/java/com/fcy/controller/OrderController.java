package com.fcy.controller;

import com.fcy.pojo.CommonResult;
import com.fcy.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 14:40 2020/3/15
 * @Modified By:
 */
@RestController
@Slf4j
public class OrderController {

   //public static final  String PAAYMENT_URL = "http://localhost:8001";
   public static final  String PAAYMENT_URL = "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return this.restTemplate.postForObject(PAAYMENT_URL + "/payment/create",payment,CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return this.restTemplate.getForObject(PAAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }


}
