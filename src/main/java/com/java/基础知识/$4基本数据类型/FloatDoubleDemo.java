package com.java.基础知识.$4基本数据类型;

import java.math.BigDecimal;

/**
 * Created by banma on 2018/8/28.
 */
public class FloatDoubleDemo {
    public static void main(String[] args) {
        //float到达一定位数后无法表示更大，千万别用f1==f2判断两个数是否相等
        float f1 = 16777215f;
        for (int i = 0; i < 10; i++) {
            System.out.println(f1);
            f1++;
        }

        //小数丢失精度
        float f = 2.2f;
        double d = (double) f;
        System.out.println(d);
        f = 2.25f;
        d = (double) f;
        System.out.println(d);

    }

    //BigDecimal构造函数一定要用BigDecimal(String s) 或 BigDecimal.valueof()
    /*
    *   BigDecimal的valueof方法用于必须用Double做为数据源
    *   public   static BigDecimal valueOf(double val) {
    *   returnnew BigDecimal(Double.toString(val));//见3.1关于JDK描述的第三点
    *}
    *
    * */
    public class Arith {
        /**
         * 提供精确加法计算的add方法
         * @param value1 被加数
         * @param value2 加数
         * @return 两个参数的和
         */
        public double add(double value1,double value2){
            BigDecimal b1 = BigDecimal.valueOf(value1);
            BigDecimal b2 = BigDecimal.valueOf(value2);
            return b1.add(b2).doubleValue();
        }

        /**
         * 提供精确减法运算的sub方法
         * @param value1 被减数
         * @param value2 减数
         * @return 两个参数的差
         */
        public double sub(double value1,double value2){
            BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
            BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
            return b1.subtract(b2).doubleValue();
        }

        /**
         * 提供精确乘法运算的mul方法
         * @param value1 被乘数
         * @param value2 乘数
         * @return 两个参数的积
         */
        public double mul(double value1,double value2){
            BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
            BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
            return b1.multiply(b2).doubleValue();
        }

        /**
         * 提供精确的除法运算方法div
         * @param value1 被除数
         * @param value2 除数
         * @param scale 精确范围
         * @return 两个参数的商
         * @throws IllegalAccessException
         */
        public double div(double value1,double value2,int scale) throws IllegalAccessException{
            //如果精确范围小于0，抛出异常信息
            if(scale<0){
                throw new IllegalAccessException("精确度不能小于0");
            }
            BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
            BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
            return b1.divide(b2, scale).doubleValue();
        }
    }

}
