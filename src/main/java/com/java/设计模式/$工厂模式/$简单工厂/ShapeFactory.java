package com.java.设计模式.$工厂模式.$简单工厂;

/**
 * @ClassName:ShapeFactory
 * @Description:图形工厂
 * @Author: guoyong
 * @Date:2020/5/8 11:27
 **/
public class ShapeFactory {

    public Shape getShape(String type){
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")){
            shape = new CircleShape();
        }else if (type.equalsIgnoreCase("rect")){
            shape = new RectShape();
        }else if (type.equalsIgnoreCase("triangle")){
            shape = new TriangleShape();
        }
        return shape;
    }
}
