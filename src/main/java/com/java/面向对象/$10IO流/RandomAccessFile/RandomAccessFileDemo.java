package com.java.面向对象.$10IO流.RandomAccessFile;

import java.io.*;

/**
 * @ClassName RandomAccessFileDemo
 * @Auther: banma
 * @Date: 2019/1/9 10:20
 * @Description: RandomAccessFile's demo
 */
public class RandomAccessFileDemo {

    /**
     *
     * 功能描述: 从指定位置读取文件
     *
     * @param: [path, pointer]
     * @return: void
     * @auther: banma
     * @date: 2019/1/9 10:25
     */
    public static void randomRead(String path,int pointer){
        try {
            RandomAccessFile raf = new RandomAccessFile(path,"r");
            System.out.println("文件指针初始位置是："+ raf.getFilePointer());
            raf.seek(pointer);
            byte[] buf = new byte[1024];
            int len = 0 ;
            while ((len = raf.read(buf))!=-1){
                System.out.println(new String(buf,0,len));
            }
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * 功能描述: 追加文件
     *
     * @param: [path]
     * @return: void
     * @auther: banma
     * @date: 2019/1/9 10:49
     */
    public static void randomWrite(String path){
        try {
            RandomAccessFile raf = new RandomAccessFile(path,"rw");
            raf.seek(raf.length());
            raf.write("我是追加的\n\r".getBytes());
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * 功能描述: 从文件制定位置插入内容
     *
     * @param: [path, pointer, content]
     * @return: void
     * @auther: banma
     * @date: 2019/1/9 11:30
     */
    public static void insert(String path,int pointer,String content){
        try {
            //创建一个临时文件来保存指针之后的内容
            File temp = File.createTempFile("temp",null);
            temp.deleteOnExit();

            //读取指针之后的内容，存储到临时文件中
            RandomAccessFile raf = new RandomAccessFile(path,"rw");
            raf.seek(pointer);

            FileInputStream fis = new FileInputStream(temp);
            FileOutputStream fos = new FileOutputStream(temp);
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = raf.read(buffer))!=-1){
                fos.write(buffer,0,len);
                fos.flush();
            }

            //添加内容
            raf.seek(pointer);
            raf.write(content.getBytes());
            //将临时文件内容写回原有文件指针之后
            while ((len=fis.read(buffer))!=-1){
                raf.write(buffer,0,len);
            }
            raf.close();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        randomRead("C:\\Users\\banma\\Desktop\\rabbitmq连接不上.txt",100);
        randomWrite("C:\\Users\\banma\\Desktop\\rabbitmq连接不上.txt");
        insert("C:\\Users\\banma\\Desktop\\rabbitmq连接不上.txt",300,"追加一下这些内容！");
    }
}
