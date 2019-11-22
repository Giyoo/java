package com.java.面向对象.$8泛型;

/**
 * Created by banma on 2018/11/5.
 */
public class GenericClassBox<T> {
    //泛型类命名在类型后面加<>即可
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        System.out.println(t.toString());
        return t;
    }

    public static void main(String[] args) {
        GenericClassBox<String> stringBox = new GenericClassBox<>();
        GenericClassBox<Integer> integerBox = new GenericClassBox<>();
        stringBox.setT("String！");
        integerBox.setT(4);
        stringBox.getT();
        integerBox.getT();
    }
}
