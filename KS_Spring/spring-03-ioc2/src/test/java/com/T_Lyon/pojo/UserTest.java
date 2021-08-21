package com.T_Lyon.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {

        //Spring容器，类似于婚介网站
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //User user = (User)context.getBean("user");
        //别名
        //User user = (User)context.getBean("userNew");

        //创建同一个对象
        /*User user2 = (User)context.getBean("user");
        System.out.println(user == user2);*/

        //user.show();


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //会将所有的实例创建，即beans.xml中的所有bean都会被实例化创建
        User user = (User) context.getBean("User");
        user.show();

        UserConstructor userConstructor = (UserConstructor) context.getBean("UserConstructor");
        UserConstructor userConstructor2 = (UserConstructor) context.getBean("UserConstructor");
        userConstructor.show();
        System.out.println(userConstructor == userConstructor2);


        UserT userT = (UserT) context.getBean("t2");
        userT.show();

    }
}
