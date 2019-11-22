package com.java.面向对象.$9集合;

import java.util.ArrayList;

/**
 * Created by banma on 2018/11/22.
 */
public class ConllectionData<T> extends ArrayList<T> {
    public ConllectionData(Generator<T> gen,int quantity){
        for (int i = 0; i< quantity;i++){
            add(gen.next());
        }
    }
    public static <T> ConllectionData<T> list(Generator<T> gen,int quantity){
        return new ConllectionData<T>(gen,quantity);
    }
}
