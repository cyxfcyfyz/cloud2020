package com.fcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 18:46 2020/3/11
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
