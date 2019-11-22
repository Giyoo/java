package com.java.面向对象.$10IO流.转换控制;

import java.io.*;

/**
 * @ClassName CastStreamDemo
 * @Auther: banma
 * @Date: 2019/1/8 13:52
 * @Description: TODO
 */
public class CastStreamDemo {
    public static void main(String[] args) {
        //获取系统输入流
        InputStream in = System.in;
        //转换字符流处理
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        //每次读取单行数据写入外部文件
        try {
            //构造输出流
            FileWriter fw = new FileWriter("castSteam.txt");
            BufferedWriter writer = new BufferedWriter(fw);
            while ((line = reader.readLine())!=null){
                if (line.equals("quit"))
                    break;
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
