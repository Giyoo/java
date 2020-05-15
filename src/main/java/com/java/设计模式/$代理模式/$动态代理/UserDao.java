package com.java.设计模式.$代理模式.$动态代理;

/**
 * @ClassName:UserDao
 * @Description:dao
 * @Author: guoyong
 * @Date:2020/5/13 10:58
 **/
public class UserDao implements IUserDao{

    @Override
    public void save(String word) {
        System.out.println(word);
        System.out.println("保存成功-----！");
    }
}
