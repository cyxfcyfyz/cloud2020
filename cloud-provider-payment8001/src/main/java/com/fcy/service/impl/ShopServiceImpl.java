package com.fcy.service.impl;

import com.fcy.dao.Shop;
import com.fcy.dao.ShopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 20:29 2020/3/12
 * @Modified By:
 */
@Service
public class ShopServiceImpl {

    @Autowired
    private ShopDao shopDao;

    public int updateStock(Integer id){
        return shopDao.updateStock(id);
    }


    public int selectStock(Integer id){
        return shopDao.selectStock(id);
    }

    public int insert(List<Shop> shop){
        return shopDao.insert(shop);
    }

}
