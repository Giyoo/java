package com.java.面向对象.$9集合;

import java.util.Comparator;

/**
 * Created by banma on 2018/12/8.
 */
public class ComparatorDemo implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().length()-o1.getName().length()==0?o2.getName().compareTo(o1.getName()):o2.getName().length()-o1.getName().length();
    }
}
