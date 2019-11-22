package com.java.面向对象.$9集合;

import java.util.LinkedList;

/**
 * Created by banma on 2018/12/8.
 */
public class LinkedListStack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    /**入栈*/
    public void push(T v){
        storage.addFirst(v);
    }

    /**出栈不删除*/
    public T peek(){
        return storage.getFirst();
    }

    /**出栈*/
    public T pop(){
        return storage.removeFirst();
    }
}
