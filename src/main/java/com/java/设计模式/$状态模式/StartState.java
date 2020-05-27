package com.java.设计模式.$状态模式;

/**
 * @ClassName:StartState
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/26 10:57
 **/
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("start");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state!";
    }
}
