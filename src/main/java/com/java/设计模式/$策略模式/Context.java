package com.java.设计模式.$策略模式;

/**
 * @ClassName:Context
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/25 11:35
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int excuteStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }

    public static void main(String[] args) {
        Context context = new Context(new OprationAdd());
        System.out.println(context.excuteStrategy(1,2));
        context = new Context(new OprationSubtract());
        System.out.println(context.excuteStrategy(1,2));
    }
}
