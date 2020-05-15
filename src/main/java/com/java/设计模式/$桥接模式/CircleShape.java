package com.java.设计模式.$桥接模式;

/**
 * @ClassName:CircleShape
 * @Description:圆形类
 * @Author: guoyong
 * @Date:2020/5/14 11:25
 **/
public class CircleShape extends AbstractShape {
    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public void print() {
        color.printCorlor();
        System.out.println("圆形！");

    }
}
