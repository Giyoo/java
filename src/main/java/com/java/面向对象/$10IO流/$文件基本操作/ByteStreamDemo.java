package com.java.面向对象.$10IO流.$文件基本操作;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName ByteStreamDemo
 * @Auther: banma
 * @Date: 2019/1/7 18:13
 * @Description: 通过字节流复制文件
 */
public class ByteStreamDemo {
    private static final String LINE_SPEARATOR = System.getProperty("line.separator");

    private static final int BUFFER_SIZE = 1024;

    static void writeContentFile() {
        //声明输出流对象
        FileOutputStream fos = null;
        //指定输出内容
        String content = "first" + LINE_SPEARATOR + "second";

        try {
            fos = new FileOutputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\test.txt");
            fos.write(content.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void copyFile_1() {
        //声明输入流和输出流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //输入流内读出，输出流写入
        try {
            fis = new FileInputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\test.txt");
            fos = new FileOutputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\test_copy.txt");
            int position = 0;
            while ((position = fis.read()) != -1) {
                fos.write(position);
            }
        } catch (FileNotFoundException e) {
            System.out.println("未发现文件！");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO异常！");
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void copyFile_2() {
        //声明输入流和输出流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //输入流内读出，输出流写入
        try {
            fis = new FileInputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\test.txt");
            fos = new FileOutputStream("C:\\\\Users\\\\banma\\\\Desktop\\\\test_copy.txt");
            byte[] bytes = new byte[BUFFER_SIZE];
            int length = 0;
            while ((length = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, length);
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件未发现！");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO异常！");
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\keking\\Desktop\\其他\\ReceiptInfoParam.java");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\keking\\Desktop\\其他\\test13.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos));
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line = null;
        String jieshi = "";
        while ((line=bufferedReader.readLine())!=null){
            if (line.contains("*")&&testIsContain(line)){
                System.out.println("|"+line.trim().replace("*",""));
                jieshi = line.trim().replace("*","")+"|";
//                bufferedWriter.write("|"+line.replace("*",""));
            }
            if (line.contains("private")){
                String[] str = line.trim().split(" ");
                System.out.println("|"+str[1]+"|"+str[2].replace(";","")+"|");
                bufferedWriter.write("|"+str[2].replace(";","")+"|"+str[1]+"|");
                bufferedWriter.write(jieshi);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }
        fis.close();
        fos.close();

    }
    public static int appearNumber(String srcText, String findText) {
        int count = 0;
        Pattern p = Pattern.compile(findText);
        Matcher m = p.matcher(srcText);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static boolean testIsContain(String str){
        int count = 0;
        String regEx = "[\\u4e00-\\u9fa5]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);      //p.matcher()只适合做
        while (m.find()) { //m.matches()全部匹配为true
            //m.groupCount()用于获取正则模式中子模式匹配的组，即只有正则中含有（）分组的情况下才有用
            for (int i = 0; i <= m.groupCount(); i++) {
                count++;
            }
        }
        if (count!=0){
            return true;
        }
        return false;
    }

}
