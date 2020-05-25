package com.java.设计模式.$策略模式;

/**
 * @ClassName:OprationSubtract
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 11:34
 **/
public class OprationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
