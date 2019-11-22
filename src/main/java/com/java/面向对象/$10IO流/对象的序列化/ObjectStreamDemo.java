package com.java.面向对象.$10IO流.对象的序列化;

import java.io.*;

/**
 * @ClassName ObjectStreamDemo
 * @Auther: banma
 * @Date: 2019/1/8 11:39
 * @Description: TODO
 */
public class ObjectStreamDemo {

    public static void whriteObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\Person"));
        oos.writeObject(new Person("小强",20,"19387744675"));
        oos.close();
    }

    public static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\Person"));
        Person p = (Person) ois.readObject();
        System.out.println(p.getAge()+p.getName()+p.getPhone());
    }

    public static void main(String[] args) {
        try {
            whriteObject();
            readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
