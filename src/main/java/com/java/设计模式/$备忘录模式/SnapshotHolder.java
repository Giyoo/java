package com.java.设计模式.$备忘录模式;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName:SnapshotHolder
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/27 16:37
 **/
public class SnapshotHolder {
    private Stack<SnapShot> stack = new Stack<>();

    public void pushSnapshot(SnapShot snapShot){
        stack.push(snapShot);
    }

    public SnapShot popSnapshot(){
        return stack.pop();
    }

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            if (input.equalsIgnoreCase(":list")){
                System.out.println(inputText.getText());
            }else if (input.equalsIgnoreCase(":undo")){
                SnapShot snapShot = snapshotHolder.popSnapshot();
                inputText.restoreSnapShot(snapShot);
                System.out.println(inputText.getText());
            }else {
                snapshotHolder.pushSnapshot(inputText.createSnapShot());
                inputText.append(input);

            }
        }
    }
}
