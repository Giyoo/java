package com.java.面向对象.$10IO流.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName PropertiesDemo
 * @Auther: banma
 * @Date: 2019/1/8 17:05
 * @Description: TODO
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("pass.properties");
        if (!file.exists())
            file.createNewFile();
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        String password = prop.getProperty("password");
        System.out.println(password);
        FileOutputStream fos = new FileOutputStream(file);
        prop.setProperty("password","123456");
        prop.store(fos,"写入密码！！！");
    }
}
