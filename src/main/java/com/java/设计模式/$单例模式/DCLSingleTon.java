package com.java.设计模式.$单例模式;

/**
 * @ClassName:DCLSingleTon
 * @Description:双锁检查单例
 * @Author: guoyong
 * @Date:2020/5/7 18:41
 **/
public class DCLSingleTon {
    private static volatile DCLSingleTon dclSingleTon;
    private DCLSingleTon(){}
    public static DCLSingleTon getInstance(){
        if (null==dclSingleTon){
            synchronized (DCLSingleTon.class){
                if (dclSingleTon == null){
                    dclSingleTon = new DCLSingleTon();
                }
            }
        }
        return dclSingleTon;
    }
}
