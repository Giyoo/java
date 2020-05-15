package com.java.设计模式.$工厂模式.$工厂方法;

import com.java.设计模式.$工厂模式.$简单工厂.CircleShape;
import com.java.设计模式.$工厂模式.$简单工厂.Shape;

/**
 * @ClassName:CircleShapeFactory
 * @Description:圆形工厂
 * @Author: guoyong
 * @Date:2020/5/8 11:55
 **/
public class CircleShapeFactory implements ShapeFactory{

    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
