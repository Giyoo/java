package com.java.设计模式.$访问者模式;

/**
 * @ClassName:ResourceFile
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 15:13
 **/
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accepet(Visitor visitor);
}
