package com.fcy;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 18:33 2020/3/11
 * @Modified By:
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class);
    }

    @Bean
    public Redisson redisson(){
        //此为单机模式
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379").setDatabase(0);
        return (Redisson) Redisson.create(config);
    }
}
