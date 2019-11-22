package com.java.面向对象.$8泛型;

/**
 * Created by banma on 2018/11/5.
 */
public class GenericMethod {

    public static <K,V> boolean compare(Pair<K,V> pair1,Pair<K,V> pair2){
        return pair1.key.equals(pair2.getKey())&&pair1.getValue().equals(pair2.getValue());
    }

    public static class Pair<K,V>{
        private K key;
        private V value;
        public Pair(K key,V value){
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }


    }

    public static void main(String[] args) {
        Pair<String,Integer> p1 = new Pair<>("A",1);
        Pair<String,Integer> p2 = new Pair<>("B",2);
        System.out.println(compare(p1,p2));
    }

}

