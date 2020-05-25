package com.java.设计模式.模板模式;

/**
 * @ClassName:Method1Class
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/22 15:10
 **/
public class Method1Class extends AbstractMethod{
    @Override
    void method1() {
        System.out.println("method1执行");
    }

    @Override
    void method2() {
        System.out.println("method2执行");
    }

    public static void main(String[] args) {
        AbstractMethod abstractMethod = new Method1Class();
        abstractMethod.method();
    }
}
