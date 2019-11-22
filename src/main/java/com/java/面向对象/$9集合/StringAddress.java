package com.java.面向对象.$9集合;

import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by banma on 2018/11/22.
 */
public class StringAddress {
    private  String s;
    public StringAddress(String s){
        this.s = s;
    }
    public String toString(){
        return super.toString() + " " + s;
    }

}
