package com.java.设计模式.$责任链模式;

/**
 * @ClassName:HandlerB
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 18:47
 **/
public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        System.out.println("handlerB处理完了");
        if (!handled&&successor!=null){
            successor.handle();
        }
    }
}
