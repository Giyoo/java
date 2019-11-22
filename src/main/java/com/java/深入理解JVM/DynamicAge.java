package com.java.深入理解JVM;

/**
 * @ClassName:DynamicAge
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/8/20 10:28
 **/
public class DynamicAge {

    private static final int _1MB = 1024*1024;
    /**
     * VM参数：-verbose:gc -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15     * */
    public static void testAllocation(){
        byte[] a1,a2,a3,a4;
        a1 = new byte[_1MB/4];
        a2 = new byte[_1MB/4];
        a3 = new byte[4*_1MB];
        a3 = null;
        a3 = new byte[4*_1MB];

    }

    public static void main(String[] args) {
        DynamicAge.testAllocation();
    }
}
