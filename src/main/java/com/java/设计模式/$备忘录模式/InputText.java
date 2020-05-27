package com.java.设计模式.$备忘录模式;

/**
 * @ClassName:InputText
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 16:32
 **/
public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText(){
        return text.toString();
    }

    public void append(String input){
        text.append(input);
    }

    public SnapShot createSnapShot(){
        return new SnapShot(text.toString());
    }

    public void restoreSnapShot(SnapShot snapShot){
        this.text.replace(0,this.text.length(),snapShot.getText());
    }
}
