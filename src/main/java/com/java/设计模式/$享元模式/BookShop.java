package com.java.设计模式.$享元模式;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName:BookShop
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/20 11:00
 **/
public class BookShop {
    private static final Map<String,BookOrder> BOOKORDER_POOL = new HashMap<>();
    private static BookShop bookShop= new BookShop();
    public static BookShop getInstance(){
        return bookShop;
    }

    public BookOrder getBook(String bookName){
        BookOrder bookOrder = null;
        if (BOOKORDER_POOL.containsKey(bookName)){
            bookOrder = BOOKORDER_POOL.get(bookName);
        }else {
            bookOrder = new BookOrder(bookName);
            BOOKORDER_POOL.put(bookName,bookOrder);
        }
        return bookOrder;
    }

    public void printPool(){
        Set<String> bookNameList = BOOKORDER_POOL.keySet();
        for (String bookName:bookNameList){
            System.out.println(bookName);
        }
    }

}
