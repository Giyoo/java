package com.java.面向对象.$10IO流.对象的序列化;

import java.io.Serializable;

/**
 * @ClassName Person
 * @Auther: banma
 * @Date: 2019/1/8 11:36
 * @Description: TODO
 */
public class Person implements Serializable{
    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private int age;
    private transient String phone;
}
