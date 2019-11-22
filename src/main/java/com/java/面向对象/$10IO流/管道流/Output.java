package com.java.面向对象.$10IO流.管道流;

import java.io.PipedOutputStream;

/**
 * @ClassName Output
 * @Auther: banma
 * @Date: 2019/1/8 16:52
 * @Description: TODO
 */
public class Output implements Runnable {

    private PipedOutputStream out;

    public Output(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            out.write("我是线程B当中的输出流管道，给你输出信息了，线程A中的兄弟！".getBytes());
        }catch (Exception e){

        }
    }
}
