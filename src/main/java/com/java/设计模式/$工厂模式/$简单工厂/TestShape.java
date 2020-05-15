package com.java.设计模式.$工厂模式.$简单工厂;

/**
 * @ClassName:TestShape
 * @Description:测试类
 * @Author: guoyong
 * @Date:2020/5/8 11:32
 **/
public class TestShape {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
