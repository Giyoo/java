package com.java.面向对象.$8泛型;

/**
 * Created by banma on 2018/11/5.
 */
public class GenericInterfaceDemo implements GenericInterface<String> {
    @Override
    public String show() {
        return "泛型接口";
    }
}
