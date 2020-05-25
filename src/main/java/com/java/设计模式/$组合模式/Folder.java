package com.java.设计模式.$组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:Folder
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/20 9:58
 **/
public class Folder extends Component{
    private String name;
    private List<Component> componentList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (Component component : this.componentList) {
            component.print();
        }
    }

}
