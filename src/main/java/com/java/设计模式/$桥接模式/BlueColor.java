package com.java.设计模式.$桥接模式;

/**
 * @ClassName:BlueColor
 * @Description:蓝色
 * @Author: guoyong
 * @Date:2020/5/14 11:20
 **/
public class BlueColor implements Color{
    @Override
    public void printCorlor() {
        System.out.println("蓝色！！");
    }
}
