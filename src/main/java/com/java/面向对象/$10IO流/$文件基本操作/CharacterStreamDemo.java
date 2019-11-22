package com.java.面向对象.$10IO流.$文件基本操作;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName CharacterStreamDemo
 * @Auther: banma
 * @Date: 2019/1/8 10:18
 * @Description: 字符流复制文件
 */
public class CharacterStreamDemo {

    private static final String LINE_SPEARATOR = System.getProperty("line.separator");

    private static final int BUFFER_SIZE = 1024;

    public static void writeContentFile(){
        String content = "first" + LINE_SPEARATOR + "second";
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\\\Users\\\\banma\\\\Desktop\\\\test_character.txt");
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fw != null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFile1(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("C:\\\\Users\\\\banma\\\\Desktop\\\\test_character.txt");
            fw = new FileWriter("C:\\\\Users\\\\banma\\\\Desktop\\\\test_character_copy.txt");
            int position = 0;
            while ((position=fr.read())!=-1){
                fw.write(position);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fw != null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

                try {
                    if (fr != null)
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public static void copyFile2(){
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\\\Users\\\\banma\\\\Desktop\\\\test_character.txt");
            fw = new FileWriter("C:\\\\Users\\\\banma\\\\Desktop\\\\test_character_copy2.txt");
            char[] chars = new char[BUFFER_SIZE];
            int length = 0;
            while((length = fr.read(chars))!=-1){
                fw.write(chars,0,length);
                fw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fr!=null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        writeContentFile();
        copyFile1();
        copyFile2();
    }
}
