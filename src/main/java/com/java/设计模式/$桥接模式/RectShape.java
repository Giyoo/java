package com.java.设计模式.$桥接模式;

/**
 * @ClassName:RectShape
 * @Description:抽象形状类
 * @Author: guoyong
 * @Date:2020/5/14 11:26
 **/
public class RectShape extends AbstractShape {
    public RectShape(Color color) {
        super(color);
    }

    @Override
    public void print() {
        color.printCorlor();
        System.out.println("正方形！");
    }
}
