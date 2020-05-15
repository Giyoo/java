package com.java.设计模式.$工厂模式.$简单工厂;

/**
 * @ClassName:CircleShape
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/8 11:20
 **/
public class CircleShape implements Shape {

    public CircleShape() {
        System.out.println("圆形生成器初始化完成了！");
    }

    @Override
    public void draw() {
        System.out.println("画出圆形了！！");
    }
}
