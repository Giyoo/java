package com.java.设计模式.$访问者模式;

public interface Visitor {
    void visit(PDFFile pdfFile);
    void visit(WORDFIle wordfIle);
    void visit(PPTFile pptFile);
}
