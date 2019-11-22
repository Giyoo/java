package com.java.面向对象.$9集合;

import lombok.Data;

/**
 * Created by banma on 2018/12/8.
 */
@Data
public class Person implements Comparable<Person>{

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return o.getAge()-this.age;
    }
}
