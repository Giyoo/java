package com.java.设计模式.$访问者模式;

import java.lang.ref.Reference;

/**
 * @ClassName:PDFFile
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 15:15
 **/
public class PDFFile extends ResourceFile {
    public PDFFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accepet(Visitor visitor) {
        visitor.visit(this);
    }
}
