package com.java.设计模式.$装饰器模式;

/**
 * @ClassName:TestMain
 * @Description:测试类
 * @Author: guoyong
 * @Date:2020/5/14 13:42
 **/
public class TestMain {
    public static void main(String[] args) {
        Me me = new Me();
        Hat hat = new Hat(me);
        AbStractClothes shoes = new Shoes(hat);
        shoes.show();
    }
}
