package com.java.设计模式.$访问者模式;

/**
 * @ClassName:PPTFile
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 15:16
 **/
public class PPTFile extends ResourceFile{
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accepet(Visitor visitor) {
        visitor.visit(this);
    }
}
