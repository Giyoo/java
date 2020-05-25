package com.java.设计模式.模板模式;

/**
 * @ClassName:AbstractMethod
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/22 15:08
 **/
public abstract class AbstractMethod {
    public final void method(){
        method1();
        method2();
    }

    abstract void method1();
    abstract void method2();
}
