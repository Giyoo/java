package com.java.设计模式.$迭代器模式;

public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}
