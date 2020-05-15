package com.java.设计模式.$代理模式.$动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName:ProxyFactory
 * @Description:动态代理
 * @Author: guoyong
 * @Date:2020/5/13 10:59
 **/
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始插入代码");
                Object returnValue = method.invoke(target,args);
                System.out.println("完成插入代码");
                return returnValue;

            }
        });
    }
}
