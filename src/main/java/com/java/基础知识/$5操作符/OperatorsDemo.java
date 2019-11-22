package com.java.基础知识.$5操作符;

/**
 * Created by banma on 2018/9/5.
 */
public class OperatorsDemo {

    public static void main(String[] args) {
        //1.不通过第三个变量互换两个变量的值
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a="+a);
        System.out.println("b="+b);

        //2.类型转换问题
        byte c = 3+1;
        byte c1 = 3;
        byte c2 = 1;
//        c = c1+c2; 报错 byte short运算时会自动转换成int类型，java机制如此规定的，因为byte short很容易溢出，所以先转换成int然后进行运算，所以b=b1+b2会报错


        //3.移位运算符
        int d = 8;
        int e = 8;
        int d1 = d >> 2;
        int d2 = d << 2;
        int d3 = d >>> 2;
        System.out.println("d1>>:"+d1);
        System.out.println("d2>>:"+d2);
        System.out.println("d3>>>:"+d3);


        //4.自增问题
        int i = 10;
        i = i++ ;
        System.out.println("i"+i);


        //5.强转问题
        short f = 10;
//        f = f + 1; f为short 1为int f转换为int与1运算后结果为int类型，int转换short错误
        f += 1; //结果会强制转换为左边的类型
        /*
        * 【复合赋值运算符包含的隐式类型转换】
　　       short s1 = 1; s1 = s1 + 1会引起编译错误，s1+1表达式类型会自动提升为int类型，而s1的声明类型为short类型，所以将一个int类型的值赋给short类型将引起编译错误。
　　       但short s1 = 1; s1 += 1;不会出错，因为表达式中使用了+=复合赋值运算符，复合赋值运算符包含了一个隐式的类型转换。s1 = s1 + 1和s1 += 1实际上并不等价。
           s1+=1实际上等于s1 = (s1的类型）s1+1，复合赋值运算符会自动将他计算的结果值强制类型转换为其左边变量的类型。*/
    }
}
