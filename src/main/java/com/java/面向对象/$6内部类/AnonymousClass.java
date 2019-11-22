package com.java.面向对象.$6内部类;

/**
 * Created by banma on 2018/10/24.
 */
//匿名内部类
public class AnonymousClass {

    int show(){
        int num = 3;
        return new inner(){
            @Override
            public int getNum() {
                return num;
            }
        }.getNum();
    }

    void show1(){
        new Father(){
            @Override
            void love() {
                System.out.println("i o v e");
            }
        };
    }

}

interface inner{
    int getNum();
}

class Father{
    void love(){
        System.out.println("love");
    }
}
