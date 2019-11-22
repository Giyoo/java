package com.java.面向对象.$9集合;

import java.util.*;

/**
 * Created by banma on 2018/12/2.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        //方法一览
        boolean containKeyRes = map.containsKey("语文");
        System.out.println("map.containsKey(\"语文\")"+containKeyRes);
        boolean containValueRes = map.containsValue(4);
        System.out.println("map.containsValue(4)"+containValueRes);
        Integer huaxue = map.get("化学");
        System.out.println("map.get(\"化学\")"+huaxue);
        System.out.println("map.isEmpty()"+map.isEmpty());
        System.out.println("map.remove(英语)"+map.remove("英语"));
        Collection collection = map.values();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历方法
        //1.遍历entrySet
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry entry:entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //2.遍历keySet
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            System.out.println(key);
            System.out.println(map.get(key));
        }
        //3.values直接获取值
        Collection<Integer> collection1 = map.values();
        for (Integer integer:collection1){
            System.out.println(integer);
        }
        //4.通过entry的iterator获取
        Iterator entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry entry = (Map.Entry) entries.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
