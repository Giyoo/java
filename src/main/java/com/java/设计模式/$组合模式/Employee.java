package com.java.设计模式.$组合模式;

/**
 * @ClassName:Employee
 * @Description:员工
 * @Author: guoyong
 * @Date:2020/5/18 19:07
 **/
public class Employee extends HumanResource{
    public Employee(long id,double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
