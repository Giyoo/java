package com.java.设计模式.$观察者模式;

/**
 * @ClassName:MailObserver
 * @Description:邮件通知
 * @Author: guoyong
 * @Date:2020/5/21 15:00
 **/
public class MailObserver implements Observer{
    @Override
    public void haldle() {
        System.out.println("我发送邮件了");
    }
}
