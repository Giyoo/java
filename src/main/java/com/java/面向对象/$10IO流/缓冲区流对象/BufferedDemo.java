package com.java.面向对象.$10IO流.缓冲区流对象;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName BufferedDemo
 * @Auther: banma
 * @Date: 2019/1/8 11:22
 * @Description: 缓冲区流
 */
public class BufferedDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\\\Users\\\\banma\\\\Desktop\\\\test_buffer.txt");
            BufferedWriter br = new BufferedWriter(fw);
            br.write("这是个测试buffer的文件！！");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
