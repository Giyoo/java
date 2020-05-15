package com.java.设计模式.$单例模式;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName:InnerClassSingleton
 * @Description:内部类单例
 * @Author: guoyong
 * @Date:2020/5/7 18:47
 **/
public class InnerClassSingleton {
    private InnerClassSingleton(){}

    public InnerClassSingleton getInstance(){
        return SingletonHolder.in;
    }

    private static class SingletonHolder{
        private static final InnerClassSingleton in = new InnerClassSingleton();
    }

    public static void main(String[] args) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse("2022-1-01");
    }
}
