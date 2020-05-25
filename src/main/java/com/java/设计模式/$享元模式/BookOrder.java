package com.java.设计模式.$享元模式;

/**
 * @ClassName:BookOrder
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/20 10:59
 **/
public class BookOrder implements Book{
    private String bookName;

    public BookOrder(String bookName) {
        this.bookName = bookName;
    }


    @Override
    public void saled() {
        System.out.println(bookName+"被卖了！");
    }
}
