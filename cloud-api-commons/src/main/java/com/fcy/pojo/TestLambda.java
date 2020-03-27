package com.fcy.pojo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 19:45 2020/3/20
 * @Modified By:
 */
public class TestLambda {


    @Test
    public void test1() {
        List<Student> studentList = Arrays.asList(
                new Student("张三", 29, "男"),
                new Student("李四", 20, "女"),
                new Student("王五", 18, "女"),
                new Student("赵六", 30, "男")
        );

        studentList.stream()
                .filter((e) -> e.getSex() == "女")
                .forEach(System.out::println);

        System.out.println("==============");

        studentList.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }


    //fcy添加了代码
    
    //张三添加了代码

}
