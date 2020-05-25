package com.java.设计模式.$组合模式;

/**
 * @ClassName:HumanResource
 * @Description:员工公司抽象类
 * @Author: guoyong
 * @Date:2020/5/18 19:06
 **/
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
