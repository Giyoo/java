package com.java.深入理解JVM;

/**
 * @ClassName:MethodSOF
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/10/28 11:24
 **/
public class MethodSOF {
    int i = 0;
    public void loop(){
        i++;
        this.loop();
    }

    public static void main(String[] args) {
            MethodSOF methodSOF = new MethodSOF();
            methodSOF.loop();
    }
}
