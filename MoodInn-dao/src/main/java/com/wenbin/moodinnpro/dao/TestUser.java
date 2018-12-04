package com.wenbin.moodinnpro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Autowired
    static UserDao dao;

    public static void main(String[] args) {
        getCount();
        getAll();
    }

    public static void getCount(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        dao=ctx.getBean(UserDao.class);
        System.out.println(dao.getCountAll("","",""));
    }
    public static void getAll(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        dao=ctx.getBean(UserDao.class);
        System.out.println(dao.getAll("","xiaojiejie@qq.com","姐",0,5));
    }

}
