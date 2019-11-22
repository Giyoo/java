package com.java.面向对象.$7枚举类;

/**
 * Created by banma on 2018/10/28.
 */
public enum EnumDemo {
    //1.基本命名形式
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {
        EnumDemo[] value = EnumDemo.values();
    }
}
