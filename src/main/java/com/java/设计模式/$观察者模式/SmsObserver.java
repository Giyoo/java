package com.java.设计模式.$观察者模式;

/**
 * @ClassName:SmsObserver
 * @Description:短信
 * @Author: guoyong
 * @Date:2020/5/21 15:01
 **/
public class SmsObserver implements Observer{
    @Override
    public void haldle() {
        System.out.println("发送短信啦！");
    }
}
