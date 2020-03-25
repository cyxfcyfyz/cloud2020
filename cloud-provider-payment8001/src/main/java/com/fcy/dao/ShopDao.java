package com.fcy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 20:28 2020/3/12
 * @Modified By:
 */
@Mapper
public interface ShopDao {

    @Update("update t_shop set stock=stock-1 where id=#{id} and stock>0")
    int updateStock(@Param("id") Integer id);

    @Select("select stock from t_shop where id=#{id}")
    int selectStock(@Param("id") Integer id);

    int insert(List<Shop> shop);


}
