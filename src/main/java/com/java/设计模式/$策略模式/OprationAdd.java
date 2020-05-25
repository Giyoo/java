package com.java.设计模式.$策略模式;

/**
 * @ClassName:OprationAdd
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 11:33
 **/
public class OprationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
