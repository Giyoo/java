package com.java.设计模式.$桥接模式;

/**
 * @ClassName:AbstractShape
 * @Description:形状抽象类
 * @Author: guoyong
 * @Date:2020/5/14 11:22
 **/
public abstract class AbstractShape {
    Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void print();
}
