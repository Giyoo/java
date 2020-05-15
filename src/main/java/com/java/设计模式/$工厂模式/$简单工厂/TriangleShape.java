package com.java.设计模式.$工厂模式.$简单工厂;

/**
 * @ClassName:TriangleShape
 * @Description:三角形生成器
 * @Author: guoyong
 * @Date:2020/5/8 11:25
 **/
public class TriangleShape implements Shape{

    public TriangleShape() {
        System.out.println("三角形生成器初始化完成！");
    }

    @Override
    public void draw() {
        System.out.println("画出三角形了！");
    }
}
