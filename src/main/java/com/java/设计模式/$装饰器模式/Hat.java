package com.java.设计模式.$装饰器模式;

/**
 * @ClassName:Hat
 * @Description:帽子
 * @Author: guoyong
 * @Date:2020/5/14 13:39
 **/
public class Hat extends AbStractClothes{
    public Hat(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("我穿上帽子了！");
    }

}
