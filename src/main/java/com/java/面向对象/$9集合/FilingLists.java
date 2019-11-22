package com.java.面向对象.$9集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by banma on 2018/11/22.
 */
public class FilingLists {
    //填充容器两种方法Collections.nCopies(),Collections.fill()
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4,new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("world!"));
        System.out.println(list);
    }

}
