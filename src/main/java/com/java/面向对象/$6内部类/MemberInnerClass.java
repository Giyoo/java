package com.java.面向对象.$6内部类;

/**
 * Created by banma on 2018/10/23.
 */
public class MemberInnerClass {


    int a = 1;
    private int b = 2;
    static int c = 3;
    class InnerClass{
        int a = 10;
        void show(){
            //1.内部类可以无条件访问外部类的所有成员属性和成员方法(包括所有private成员和静态成员)
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            //2.当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。
            // 如果要访问外部类的同名成员，需要以下面的形式进行访问
            // 外部类.this.成员变量
            // 外部类.this.成员方法
            System.out.println(MemberInnerClass.this.a);

        }
    }

    void demo(){
        //3.外部类想成员内部的成员时，必须先创建一个成员内部类的对象，再通过这个对象的引用来访问
        InnerClass innerClass = new InnerClass();
        innerClass.show();
        int a = innerClass.a;
    }
}

class test{
    //成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，
    // 前提是必须存在一个外部类的对象。创建成员内部类对象的一般方式如下：
    MemberInnerClass memberInnerClass = new MemberInnerClass();
    MemberInnerClass.InnerClass innerClass = memberInnerClass.new InnerClass();
}
