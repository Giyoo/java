package com.java.设计模式.$代理模式.$接口代理;

/**
 * @ClassName:ProxyUserController
 * @Description：代理UserController
 * @Author: guoyong
 * @Date:2020/5/13 10:39
 **/
public class ProxyUserController implements IUserController {

    private UserController userController;

    public ProxyUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void login() {
        System.out.println("代理开始");
        userController.login();
        System.out.println("代理结束");
    }
}
