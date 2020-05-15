package com.java.设计模式.$代理模式.$接口代理;

/**
 * @ClassName:UserController
 * @Description:用户登陆
 * @Author: guoyong
 * @Date:2020/5/13 10:32
 **/
public class UserController implements IUserController{
    @Override
    public void login() {
        System.out.println("user login!!");
    }
}
