package com.java.面向对象.$10IO流.操作内存数组流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @ClassName ByteArrayStreamDemo
 * @Auther: banma
 * @Date: 2019/1/8 14:08
 * @Description: TODO
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        ByteArrayInputStream bis = new ByteArrayInputStream("abcedf".getBytes());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int ch = 0;

        while((ch=bis.read())!=-1){
            bos.write(ch);
        }

        System.out.println(bos.toString());
    }
}
