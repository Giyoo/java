package com.java.设计模式.$访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:Demo
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 15:28
 **/
public class Demo {
    public static void main(String[] args) {
        List<ResourceFile> list = new ArrayList<>();
        list.add(new PDFFile("a.pdf"));
        list.add(new WORDFIle("b.word"));
        list.add(new PPTFile("c.ppt"));
        Extractor extractor =  new Extractor();
        for (ResourceFile resourceFile:list){
            resourceFile.accepet(extractor);
        }

        Compress compress = new Compress();
        for (ResourceFile resourceFile:list){
            resourceFile.accepet(compress);
        }
    }
}
