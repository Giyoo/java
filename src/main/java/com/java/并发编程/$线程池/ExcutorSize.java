package com.java.并发编程.$线程池;

/**
 * @ClassName:ExcutorSize
 * @Description:线程池大小设置
 * @Author: guoyong
 * @Date:2019/12/9 13:55
 **/
public class ExcutorSize {

    int nCpu = Runtime.getRuntime().availableProcessors();
    //计算密集型
    int cpuBoundNumber = nCpu+1;
    //IO 密集型
    int IOBoundNumber = 2*nCpu+1;
    //控制计算
    //利用率
    double utilization = 0.90;
    double threadNumber = nCpu*utilization*(1+0.1);

    public static void main(String[] args) {
        ExcutorSize excutorSize = new ExcutorSize();
        System.out.println(excutorSize.nCpu);
        System.out.println(excutorSize.threadNumber);
    }
}
