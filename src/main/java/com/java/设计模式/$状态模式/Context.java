package com.java.设计模式.$状态模式;

/**
 * @ClassName:Context
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/26 10:56
 **/
public class Context {
    State state;

    public Context() {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

    }
}
