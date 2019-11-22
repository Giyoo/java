package com.java.深入理解JVM;

/**
 * @ClassName:StaticDispatch
 * @Description:静态分派
 * @Author: guoyong
 * @Date:2019/9/9 11:02
 **/
public class StaticDispatch {

    abstract static class Human{}

    static class Man extends Human{}

    static class Women extends Human{}

    public void sayHello(Human human){
        System.out.println("hi guys!");
    }

    public void sayHello(Man man){
        System.out.println("hi man!");
    }


    public void sayHello(Women women){
        System.out.println("hi women!");
    }

    public static void main(String[] args) {
        Man m = new Man();
        Women w = new Women();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(m);
        staticDispatch.sayHello(w);
    }

}
