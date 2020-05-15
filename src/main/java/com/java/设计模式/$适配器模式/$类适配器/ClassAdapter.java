package com.java.设计模式.$适配器模式.$类适配器;

import com.java.设计模式.$适配器模式.Bird;
import com.java.设计模式.$适配器模式.Pig;

/**
 * @ClassName:ClassAdapter
 * @Description:类适配器
 * @Author: guoyong
 * @Date:2020/5/15 10:24
 **/
public class ClassAdapter extends Pig implements Bird {

    @Override
    public void fly() {
        super.move();
    }

    @Override
    public void jjj() {

    }
}
