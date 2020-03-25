package com.fcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 14:37 2020/3/15
 * @Modified By:
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }

    /**
     * applicationContext.xml <bean id="" class=""> </bean>
     * LoadBalanced 负载均衡
     * @return
     */
    @LoadBalanced //负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
