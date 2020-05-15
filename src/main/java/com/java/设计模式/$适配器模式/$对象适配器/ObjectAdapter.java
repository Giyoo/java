package com.java.设计模式.$适配器模式.$对象适配器;

import com.java.设计模式.$适配器模式.Bird;
import com.java.设计模式.$适配器模式.Pig;

/**
 * @ClassName:ObjectAdapter
 * @Description:对象适配器
 * @Author: guoyong
 * @Date:2020/5/15 10:21
 **/
public class ObjectAdapter implements Bird {

    private Pig pig;

    public ObjectAdapter(Pig pig) {
        this.pig = pig;
    }

    @Override
    public void fly() {
        pig.move();
    }

    @Override
    public void jjj() {

    }

    @Override
    public void zzz() {

    }
}
