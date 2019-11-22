package com.java.深入理解JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:MetaspaceOOM
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/10/28 11:26
 **/
public class MetaspaceOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true){
            int i = 0;
            list.add(String.valueOf(i++).intern());
        }
    }
}
