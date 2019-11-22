package com.java.深入理解JVM;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:AllocateEdenArea
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/8/20 9:55
 **/
public class AllocateEdenArea {
    private static final int _1MB = 1024*1024;

    /**
     * VM参数：-verbose:gc -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     * */
    public static void testAllocation(){
        byte[] a1,a2,a3,a4;
        a1 = new byte[2*_1MB];
        a2 = new byte[2*_1MB];
        a3 = new byte[2*_1MB];
        a4 = new byte[4 *_1MB];
//        System.gc();
//        a4 = new byte[2*_1MB];
    }

    public static void main(String[] args) {
        AllocateEdenArea.testAllocation();
    }
}
