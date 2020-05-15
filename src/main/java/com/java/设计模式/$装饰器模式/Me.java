package com.java.设计模式.$装饰器模式;

/**
 * @ClassName:Me
 * @Description:我自己
 * @Author: guoyong
 * @Date:2020/5/14 13:36
 **/
public class Me implements AbstractPerson{
    @Override
    public void show() {
        System.out.println("我啥都没穿！");
    }
}
