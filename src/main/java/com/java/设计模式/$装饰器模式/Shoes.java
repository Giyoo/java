package com.java.设计模式.$装饰器模式;

/**
 * @ClassName:Shoes
 * @Description:鞋子
 * @Author: guoyong
 * @Date:2020/5/14 13:41
 **/
public class Shoes extends AbStractClothes{
    public Shoes(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("我穿上鞋子了！！");
    }
}
