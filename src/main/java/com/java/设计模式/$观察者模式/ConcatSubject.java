package com.java.设计模式.$观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:ConcatSubject
 * @Description:通知父类
 * @Author: guoyong
 * @Date:2020/5/21 15:04
 **/
public class ConcatSubject implements Subject{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObjserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.haldle();
        }
    }

    public static void main(String[] args) {
        ConcatSubject concatSubject = new ConcatSubject();
        concatSubject.registerObserver(new MailObserver());
        concatSubject.registerObserver(new SmsObserver());
        concatSubject.notifyObserver();
    }
}
