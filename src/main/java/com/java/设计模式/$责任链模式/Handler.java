package com.java.设计模式.$责任链模式;

/**
 * @ClassName:Handler
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 18:39
 **/
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
