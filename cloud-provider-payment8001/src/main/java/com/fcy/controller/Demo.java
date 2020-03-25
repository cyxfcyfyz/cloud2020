package com.fcy.controller;


import java.util.Arrays;
import java.util.List;

/**
 * @Author: Fcy
 * @Description:
 * @Date:Created in 21:46 2020/3/12
 * @Modified By:
 */
public class Demo {

    public static void main(String[] args) {

       /* HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key"+i, "value"+i);
        }

       *//* for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }*//*

        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        List<String> list = new ArrayList<>();

        Iterator<String> ite1 = map.keySet().iterator();

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
        Collections.sort(list);
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            linkedHashMap.put(next,map.get(next));
        }

        Iterator<Map.Entry<String, String>> iterator2 = linkedHashMap.entrySet().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }*/

        int [] array = new int[]{1,2,3};
        int [] array1 = new int[3];
        int [] array2 = {1,2,3};

        List<int[]> list = Arrays.asList(array);

        System.out.println(list.size());


    }

}
