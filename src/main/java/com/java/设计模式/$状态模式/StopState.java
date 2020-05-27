package com.java.设计模式.$状态模式;

/**
 * @ClassName:StopState
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/26 10:59
 **/
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("stop!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state!";
    }
}
