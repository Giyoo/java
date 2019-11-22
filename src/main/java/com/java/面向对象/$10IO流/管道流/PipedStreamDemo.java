package com.java.面向对象.$10IO流.管道流;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ClassName PipedStreamDemo
 * @Auther: banma
 * @Date: 2019/1/8 16:55
 * @Description: TODO
 */
public class PipedStreamDemo {

    public static void main(String[] args) throws IOException {
        PipedInputStream input = new PipedInputStream();
        PipedOutputStream output = new PipedOutputStream();

        input.connect(output);

        new Thread(new Input(input)).start();
        new Thread(new Output(output)).start();
    }
}
