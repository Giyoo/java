package com.java.面向对象.$10IO流.管道流;

import java.io.PipedInputStream;

/**
 * @ClassName Input
 * @Auther: banma
 * @Date: 2019/1/8 16:45
 * @Description: TODO
 */
public class Input implements Runnable {

    private PipedInputStream in;

    public Input(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            String s = new String(bytes,0,len);
            System.out.println("s="+s);
            in.close();
        }catch (Exception e){

        }
    }
}
