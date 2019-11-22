package com.java.面向对象.$8泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by banma on 2018/11/5.
 */
public class GenericWildCards {

    public static void main(String[] args) {
        List<? extends Person> list1 = new ArrayList<Worker>();
        List<? extends Person> list2 = new ArrayList<Student>();
        Worker worker1 = new Worker(23,"worker1");
        Worker worker2 = new Worker(26,"worker2");
        Student student1 = new Student(22,"stu1");
        Student student2 = new Student(12,"stu2");
        Person person = new Person(25,"小李子");

        //extends可以取出，但是只能添加null
        list1.add(null);
        Person p1 = list1.get(0);
        //list1.add(worker1)报错，无法添加

        //super可以添加
        List<? super Person> list3 = new ArrayList<>();
        list3.add(worker1);
        list3.add(student1);
        //Person p2 = list3.get(0);报错，无法取出
    }
}
