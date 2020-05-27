package com.java.设计模式.$访问者模式;

/**
 * @ClassName:Extractor
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 15:25
 **/
public class Extractor implements Visitor{
    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("extractor pdf");
    }

    @Override
    public void visit(WORDFIle wordfIle) {
        System.out.println("extractor word");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("extractor ppt");
    }
}
