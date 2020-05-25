package com.java.设计模式.$责任链模式;

import javax.jws.HandlerChain;

/**
 * @ClassName:HandleChain
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 18:50
 **/
public class HandleChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler){
        handler.setSuccessor(null);
        if (head==null){
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle(){
        if (head!=null){
            head.handle();
        }
    }

    public static void main(String[] args) {
        HandleChain handleChain = new HandleChain();
        handleChain.addHandler(new HandlerA());
        handleChain.addHandler(new HandlerB());
        handleChain.handle();
    }



}
