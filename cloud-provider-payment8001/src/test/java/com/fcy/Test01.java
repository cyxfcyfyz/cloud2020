package com.fcy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 22:48 2020/3/15
 * @Modified By:
 */
@Slf4j
public class Test01 {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Test
    public void Test01(){
     /* List<String> services = this.discoveryClient.getServices();
        for (String service : services) {
            log.info(service);
        }*/
    }

}
