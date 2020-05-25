package com.java.设计模式.$责任链模式;

/**
 * @ClassName:HandlerA
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 18:40
 **/
public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;//是否拦截
        System.out.println("handlerA处理完了！");
        if (!handled&&successor!=null){
            successor.handle();
        }
    }
}
