package com.java.基础知识.$10初始化与清理;

import java.io.InputStream;

/**
 * @ClassName Child
 * @Auther: banma
 * @Date: 2018/12/19 14:59
 * @Description: TODO
 */
public class Child extends Human {
    public void han(){
        System.out.println("i am a child!");
    }

    public static void main(String[] args) {
        Human human = new Child();
        human.han();
    }
}
