package com.java.深入理解JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:HeapOOM
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/10/28 11:21
 **/
public class HeapOOM {

    public static void main(String[] args) {
        List list = new ArrayList();
        while (true){
            list.add(new Object());
        }
    }
}
