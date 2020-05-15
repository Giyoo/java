package com.java.设计模式.$单例模式;

/**
 * @ClassName:HungrySingleton
 * @Description:饿汉
 * @Author: guoyong
 * @Date:2020/5/7 18:35
 **/
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
