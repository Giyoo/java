package com.java.设计模式.$组合模式;

/**
 * @ClassName:Demo
 * @Description:demo
 * @Author: guoyong
 * @Date:2020/5/19 8:56
 **/
public class Demo {
    public static void main(String[] args) {
        Department department = new Department(1);
        Department department1 =new Department(2);
        Department department2 = new Department(3);
        department1.addSubNode(new Employee(1,10));
        department1.addSubNode(new Employee(2,20));
        department2.addSubNode(new Employee(3,20));
        department2.addSubNode(department1);
        department.addSubNode(department2);
        System.out.println(department.calculateSalary());
    }
}
