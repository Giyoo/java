package com.java.设计模式.$装饰器模式;

/**
 * @ClassName:AbStractClothes
 * @Description:衣服抽象类
 * @Author: guoyong
 * @Date:2020/5/14 13:37
 **/
public abstract class AbStractClothes implements AbstractPerson{

    AbstractPerson abstractPerson;

    public AbStractClothes(AbstractPerson abstractPerson) {
        this.abstractPerson = abstractPerson;
    }

    @Override
    public void show() {
        abstractPerson.show();
    }
}
