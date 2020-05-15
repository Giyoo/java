package com.java.设计模式.$代理模式;

import com.java.设计模式.$代理模式.$动态代理.IUserDao;
import com.java.设计模式.$代理模式.$动态代理.ProxyFactory;
import com.java.设计模式.$代理模式.$动态代理.UserDao;
import com.java.设计模式.$代理模式.$接口代理.ProxyUserController;
import com.java.设计模式.$代理模式.$接口代理.UserController;
import com.java.设计模式.$代理模式.$继承代理.EProxyUserController;

/**
 * @ClassName:TestMain
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/13 10:43
 **/
public class TestMain {
    public static void main(String[] args) {
//        ProxyUserController proxyUserController = new ProxyUserController(new UserController());
//        proxyUserController.login();
//
//        EProxyUserController eProxyUserController = new EProxyUserController();
//        eProxyUserController.login();

        IUserDao iUserDao = (IUserDao) new ProxyFactory(new UserDao()).getProxyInstance();
        iUserDao.save("wordddddd");
    }
}
