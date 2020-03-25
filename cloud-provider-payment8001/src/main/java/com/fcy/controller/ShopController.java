package com.fcy.controller;

import com.fcy.dao.Shop;
import com.fcy.pojo.CommonResult;
import com.fcy.service.impl.ShopServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 20:32 2020/3/12
 * @Modified By:
 */
@RestController
@Slf4j
public class ShopController {

    @Autowired
    private ShopServiceImpl shopService;

    @Autowired
    private Redisson redisson;


    @PostMapping(value = "insert")
    public void insert(@RequestBody List<Shop> shop){
        long startTime = System.currentTimeMillis();
      /*  for (int i = 1; i < 1000; i++) {
            int i1 = shopService.insert(shop);
            if(i1 > 0){
                log.info("添加成功");
            }else{
                log.info("添加失败");
            }
        }*/
        int i = shopService.insert(shop);
        if(i > 0){
            log.info("添加成功");
            //return new CommonResult(200, "添加成功");
        }else{
            //return new CommonResult(444, "添加失败");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }


    @GetMapping(value = "index")
    public String index(){
        return "index";
    }


    @RequestMapping("/Stock/{id}")
    public CommonResult updateStock(@PathVariable("id") Integer id){
        RLock lock = redisson.getLock("ProductId");
        try {
            lock.lock(30, TimeUnit.SECONDS);
            int i = shopService.updateStock(id);
            if(i>0){
                log.info("商品购买成功");
                int stock = shopService.selectStock(id);
                log.info("商品剩余库存:"+stock);
                return new CommonResult(200, "商品购买成功",null);
            }else{
                log.info("剩余库存不足");
                return new CommonResult(444, "库存不足",null);
            }
        } finally {
            lock.unlock();
        }
    }


}
