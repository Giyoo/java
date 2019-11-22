package com.java.面向对象.$9集合;

import java.util.LinkedHashMap;

/**
 * Created by banma on 2018/12/5.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //按插入顺序
        LinkedHashMap<String,String> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put("1","张大");
        linkedHashMap1.put("2","张二");
        linkedHashMap1.put("3","张三");
        linkedHashMap1.put("4","张四");
        linkedHashMap1.put("5","张五");
        linkedHashMap1.put("6","张六");
        linkedHashMap1.put("7","张七");
        for (String str:linkedHashMap1.values()){
            System.out.println(str);
        }
        //按访问顺序
        LinkedHashMap<String,String> linkedHashMap2 = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap2.put("1","张大");
        linkedHashMap2.put("2","张二");
        linkedHashMap2.put("3","张三");
        linkedHashMap2.put("4","张四");
        linkedHashMap2.put("5","张五");
        linkedHashMap2.put("6","张六");
        linkedHashMap2.put("7","张七");
        linkedHashMap2.get("5");
        linkedHashMap2.get("2");
        for (String str:linkedHashMap2.values()){
            System.out.println(str);
        }
    }
}
