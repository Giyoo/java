package com.java.设计模式.$工厂模式.$简单工厂;

/**
 * @ClassName:RectShape
 * @Description:正方形生成器
 * @Author: guoyong
 * @Date:2020/5/8 11:23
 **/
public class RectShape implements Shape{

    public RectShape() {
        System.out.println("正方形生成器初始化完成！");
    }

    @Override
    public void draw() {
        System.out.println("画出正方形了！！");
    }
}
