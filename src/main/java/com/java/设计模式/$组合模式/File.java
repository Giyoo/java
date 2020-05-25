package com.java.设计模式.$组合模式;

/**
 * @ClassName:File
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/20 10:00
 **/
public class File extends Component {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
