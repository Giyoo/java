package com.java.设计模式.$组合模式;

/**
 * @ClassName:Component
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/20 9:57
 **/
public abstract class Component {
    public String getName() {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

    public String getContent() {
        throw new UnsupportedOperationException("不支持获取内容操作");
    }

}
