package com.java.设计模式.$工厂模式.$工厂方法;

import com.java.设计模式.$工厂模式.$简单工厂.Shape;

/**
 * @ClassName:TestFactory
 * @Description:测试共产方法
 * @Author: guoyong
 * @Date:2020/5/8 11:56
 **/
public class TestFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory  = new CircleShapeFactory();
        Shape shape = shapeFactory.getShape();
        shape.draw();
    }
}
