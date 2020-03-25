package com.fcy.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 16:12 2020/3/20
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    private Integer id;
    private String sname;
    private double price;
    private Integer stock;


}
