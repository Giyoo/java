package com.java.设计模式.$访问者模式;

/**
 * @ClassName:Compress
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 15:26
 **/
public class Compress implements Visitor{
    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("compress pdf");
    }

    @Override
    public void visit(WORDFIle wordfIle) {
        System.out.println("compress word");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("compress ppt");
    }
}
