package com.java.面向对象.$10IO流.基本数据类型操作;

import java.io.*;

/**
 * @ClassName DataStreamDemo
 * @Auther: banma
 * @Date: 2019/1/8 13:36
 * @Description: DataStream-操作基本数据类型的流
 */
public class DataStreamDemo {
    private static void write() {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                    "dataStream.txt"));
            dos.writeByte(0);
            dos.writeByte(2);
            dos.writeChar(0);
            dos.writeInt(0);
            dos.writeLong(0);
            dos.writeDouble(0);
            dos.writeFloat(0);
            dos.writeUTF("hello");
            dos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void read() {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(
                    "dataStream.txt"));
            dis.readByte();
            dis.readByte();
            dis.readChar();
            dis.readInt();
            dis.readLong();
            dis.readFloat();
            dis.readDouble();
            dis.readUTF();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        write();
        read();
    }
}
