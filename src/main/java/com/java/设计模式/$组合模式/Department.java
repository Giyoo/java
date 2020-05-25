package com.java.设计模式.$组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:Department
 * @Description:部门
 * @Author: guoyong
 * @Date:2020/5/18 19:08
 **/
public class Department extends HumanResource{

    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double subSalary = 0;
        for (HumanResource humanResource:subNodes){
            subSalary += humanResource.calculateSalary();
        }
        this.salary = subSalary;
        return subSalary;
    }

    public void addSubNode(HumanResource hr){
        subNodes.add(hr);
    }
}
