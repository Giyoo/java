package com.java.面向对象.$10IO流.序列流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @ClassName FileCuttingUtil
 * @Auther: banma
 * @Date: 2019/1/8 14:23
 * @Description: 使用序列流进行数据的分割和合并
 */
public class FileCuttingUtil {

    //缓冲区大小
    private static final int SIZE = 1024 * 1024;

    private static void splitFile(File file) throws IOException {
        //用读取流关联源文件
        FileInputStream fis = new FileInputStream(file);

        //定义一个1M的缓冲区
        byte[] buf = new byte[SIZE];

        //创建目的地
        FileOutputStream fos = null;

        int len = 0;
        int count = 1;

        Properties prop = new Properties();

        File dir = new File("C:\\Users\\banma\\Desktop\\partfiles");
        if (!dir.exists())
            dir.mkdir();
        while ((len = fis.read(buf))!= -1){
            fos = new FileOutputStream(new File(dir,(count++)+".part"));
            fos.write(buf,0,len);
            fos.close();
        }

        prop.setProperty("partcount",count+"");
        prop.setProperty("filename",file.getName());

        fos = new FileOutputStream(new File(dir,count+".properties"));

        prop.store(fos,"save file info");

        fos.close();
        fis.close();

    }

    public static void mergeFile(File dir) throws IOException {

        //获取指定目录下的配置文件对象
        File[] files = dir.listFiles(new SuffixFilter(".properties"));


        if (files.length != 1)
            throw new RuntimeException(dir + ",该目录下没有properties扩展名的文件或者不唯一");

        File confile = files[0];

        //获取该文件中的信息======================================。
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(confile);

        prop.load(fis);

        String filename = prop.getProperty("filename");
        int count = Integer.parseInt(prop.getProperty("partcount"));

        // 获取该目录下的所有碎片文件。 ==============================================
        File[] partFiles = dir.listFiles(new SuffixFilter(".part"));

        if (partFiles.length != (count - 1)) {
            throw new RuntimeException(" 碎片文件不符合要求，个数不对!应该" + count + "个");
        }

        // 将碎片文件和流对象关联 并存储到集合中。
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (int x = 0; x < partFiles.length; x++) {

            al.add(new FileInputStream(partFiles[x]));
        }

        // 将多个流合并成一个序列流。
        Enumeration<FileInputStream> en = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(en);


        FileOutputStream fos = new FileOutputStream(new File(dir,filename));

        byte[] buf = new byte[1024];

        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        fos.close();
        sis.close();
    }

    static class SuffixFilter implements FilenameFilter {

        private String suffix;

        public SuffixFilter(String suffix) {
            super();
            this.suffix = suffix;
        }

        @Override
        public boolean accept(File dir, String name) {

            return name.endsWith(suffix);
        }
    }


    public static void main(String[] args) {
        File file = new File("C:\\Users\\banma\\Desktop\\aili.jar");
        try {
            splitFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
