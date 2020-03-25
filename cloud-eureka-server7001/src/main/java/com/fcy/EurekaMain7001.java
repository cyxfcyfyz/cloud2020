package com.fcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 16:42 2020/3/15
 * @Modified By:
 */
@EnableScheduling
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
    /**
     * 固定间隔3秒，可以引用变量
     * fixedRate：以每次开始时间作为测量，间隔固定时间
     */
  /*  @Scheduled(fixedRate = 3 * 1000)
    public void task1() {
        System.out.println("999999");
    }*/
}
