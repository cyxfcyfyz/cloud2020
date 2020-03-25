package com.fcy.pojo;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 19:45 2020/3/20
 * @Modified By:
 * Lambda(函数式接口的支持) 表达式语法  (参数) -> (执行体)
 *函数式接口:若接口中只有一个抽象方法,称为函数式接口
 *
 *
 */
public class TestLambda2 {

    @Test
    public void test1(){

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello,Lambda");
            }
        };
        r.run();

        System.out.println("====================");

        /*语法格式一 : 无参数,无返回值
        () -> System.out.println("Hello,Lambda");
        */
        Runnable r1 = () -> System.out.println("Hello,Lambda");
        r1.run();

    }

    @Test
    public void test2(){
        /*语法格式二 : 有一个参数,无返回值
        (e) -> System.out.println(e);
        */
        Consumer<String> con = (e) -> System.out.println(e);
        con.accept("hello lambada");
    }

    @Test
    public void test3(){
        /*语法格式三 : 有多个参数,有返回值,lambda体中有多条语句{return}
         lambda体中如果只有一条语句可以不写return和{}
          Comparator<Integer> com = (x,y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };
        */
        Comparator<Integer> com = (x,y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };

    }


    @Test
    public void test4(){
        //lambada表达式写法 一个参数 有返回值
       MyPredicate m = (e) -> {
           if(e.equals("张三")){
               return true;
           }else{
               return false;
           }
       };
        System.out.println(m.test("张"));
    }

    List<Student> studentList = Arrays.asList(
            new Student("张三", 29, "男"),
            new Student("张三", 29, "男"),
            new Student("李四", 20, "女"),
            new Student("王五", 18, "女"),
            new Student("赵六", 30, "男")
    );
    @Test
    public void test5(){
        Collections.sort(studentList, (e1,e2) -> {
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return  -Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


    @Test
    public void test6(){
        String s = str("abcd", (str) -> str.toUpperCase());
        System.out.println(s);
    }

   public String str(String str,MyFunction mf){
        return mf.getValue(str);
   }


    /*Consumer<T> ： 消费型接口
    void accept（T t）；*/

    @Test
    public void test7(){
        Spring((e) -> System.out.println(e + "月春天到了"), 3);
    }

    public void Spring(Consumer con , int i){
        con.accept(i);
    }

   /* Function<T，R>  ： 函数型接口
          R apply（T  t）；*/
   @Test
   public void test8(){
       String s = app("abcdfcy", (str) -> str.substring(4));
       System.out.println(s);
   }
   public String app(String str , Function<String,String> fun){
       return fun.apply(str);
   }

   /* Predicate<T> : 断言型接口
    boolean test（T t）；*/
   @Test
   public void test9(){
       boolean pre = pre("张三", (str) -> str.equals("张"));
       System.out.println(pre);
   }
   public boolean pre(String str , Predicate pre){
             return pre.test(str);
   }


    @Test
    public void test10(){
        studentList.stream().filter((e) -> e.getAge()>20)
                            .limit(3)
                            .distinct()
                            .forEach(System.out::println);
        System.out.println("-------------");
        studentList.stream()
                   .map((f) -> f.getName())
                   .forEach(System.out::println);
    }

    @Test
    public void test11(){
        Optional<Student> max = studentList.stream()
                .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())
                );
        System.out.println(max);
   }

   @Test
    public void test12(){
       long count = studentList.stream()
               .count();
       System.out.println(count);
   }
//软通华为添加的代码

//fcy第二天上班写的代码

}
