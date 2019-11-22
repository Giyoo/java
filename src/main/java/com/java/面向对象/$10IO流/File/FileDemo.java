package com.java.面向对象.$10IO流.File;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 * @ClassName FileDemo
 * @Auther: banma
 * @Date: 2019/1/8 17:23
 * @Description: TODO
 */
public class FileDemo {

    private static void deleteAllFile(File dir) throws Exception {
        File[] files = dir.listFiles();
        System.out.println(files.length);
        // 遍历file对象
        for (File file : files) {
            // 如果是文件夹
            if (file.isDirectory()) {
                // 递归
                deleteAllFile(file);
            } else {// 否则直接删除文件
                file.delete();
            }
        }
        // 删除文件夹
        dir.delete();
    }

    /*
	 * 创建文件或文件夹
	 */
    public static void creatNewFile() {
        // 创建单个文件夹
        File folder = new File("E:\\FileTest");
        if (!folder.exists()) {// 判断指定文件夹是否已经存在
            boolean b = folder.mkdir();
            System.out.println("文件夹创建是否成功?" + b);
        }
        // 创建多级文件目录
        File folders = new File("E:\\FileTest\\1\\2\\3\\4");
        if (!folders.exists()) {
            boolean b = folders.mkdirs();
            System.out.println("多级文件目录创建是否成功?" + b);
        }
        // 创建文件
        File txt = new File("E:\\FileTest\\file.txt");
        if (!txt.exists()) {
            try {
                boolean b = txt.createNewFile();
                System.out.println("txt文件是否创建成功?" + b);
            } catch (IOException e) {
            }
        }

    }


    //重命名
    public static void renameToDemo() {

        File f1 = new File("c:\\9.mp3");

        File f2 = new File("d:\\aa.mp3");

        boolean b = f1.renameTo(f2);

        System.out.println("b="+b);
    }

    //文件对象的一些常用判断方法
    public static void decideFile(){
        File folder = new File("E:\\FileTest");
        //判断文件是否存在
        boolean b = folder.exists();
        //判断是不是文件夹
        boolean b1 = folder.isDirectory();
        //判断是不是文件
        boolean b2 = folder.isFile();
        //判断是不是隐藏文件
        boolean b3 = folder.isHidden();
        //测试指定路径是不是绝对路径
        boolean b4 = folder.isAbsolute();
    }



    //获取File对象信息
    public static void getFileInfo(){
        File file = new File("E:\\FileTest\\");

        String name = file.getName();//返回由此抽象路径名表示的文件或目录的名称

        String absPath = file.getAbsolutePath();//绝对路径。

        String path = file.getPath();//将此抽象路径名转换为一个路径名字符串。

        long len = file.length();//返回由此抽象路径名表示的文件的长度

        long time = file.lastModified();//最后修改时间

        Date date = new Date(time);

        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);

        String str_time = dateFormat.format(date);
        //返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null
        String parentPath = file.getParent();

        System.out.println("parent:"+parentPath);
        System.out.println("name:"+name);
        System.out.println("absPath:"+absPath);
        System.out.println("path:"+path);
        System.out.println("len:"+len);
        System.out.println("time:"+time);
        System.out.println("str_time:"+str_time);
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\banma\\Desktop\\partfiles");
        try {
            deleteAllFile(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
