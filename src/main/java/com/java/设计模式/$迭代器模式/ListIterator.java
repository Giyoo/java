package com.java.设计模式.$迭代器模式;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @ClassName:ListIterator
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/26 11:38
 **/
public class ListIterator implements Iterator{
    private int cusor;
    private List list;

    public ListIterator(List list) {
        this.cusor = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cusor != list.size();
    }

    @Override
    public void next() {
        cusor++;
    }

    @Override
    public Object currentItem() {
        if (cusor>=list.size()){
            throw new NoSuchElementException();
        }
        return list.get(cusor);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        ListIterator iterator = new ListIterator(list);
        while (iterator.hasNext()){
            String a = (String) iterator.currentItem();
            System.out.println(a);
            iterator.next();
        }
    }
}
