package com.java.设计模式.$单例模式;

/**
 * @ClassName:LazySingleTon
 * @Description:懒汉
 * @Author: guoyong
 * @Date:2020/5/7 18:36
 **/
public class LazySingleTon {

    private static LazySingleTon lazySingleTon;

    private LazySingleTon(){}

    public static LazySingleTon getInstance(){
        if (lazySingleTon == null){
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }
}
