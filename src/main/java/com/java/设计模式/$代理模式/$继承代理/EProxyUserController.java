package com.java.设计模式.$代理模式.$继承代理;

import com.java.设计模式.$代理模式.$接口代理.UserController;

/**
 * @ClassName:EProxyUserController
 * @Description:继承
 * @Author: guoyong
 * @Date:2020/5/13 10:50
 **/
public class EProxyUserController extends UserController {

    public void login(){
        System.out.println("继承代理开始");
        super.login();
        System.out.println("继承代理结束");
    }
}
