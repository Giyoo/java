package com.java.设计模式.$桥接模式;

/**
 * @ClassName:TestMain
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/14 11:27
 **/
public class TestMain {
    public static void main(String[] args) {
        CircleShape circleShape = new CircleShape(new BlueColor());
        circleShape.print();
    }
}
