package com.java.设计模式.$享元模式;

/**
 * @ClassName:Demo
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/20 11:13
 **/
public class Demo {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        bookShop.getBook("红楼梦");
        bookShop.getBook("水浒传");
        bookShop.getBook("红楼梦");
        bookShop.printPool();
    }
}
