package com.fcy.pojo;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 20:48 2020/3/20
 * @Modified By:
 */
@FunctionalInterface  //表明函数式接口 只有一个抽象方法
public interface MyPredicate<T> {

    public boolean test(T t);


}
