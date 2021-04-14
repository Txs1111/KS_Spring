package com.T_Lyon.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {

        //Spring�����������ڻ����վ
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //User user = (User)context.getBean("user");
        //����
        //User user = (User)context.getBean("userNew");

        //����ͬһ������
        /*User user2 = (User)context.getBean("user");
        System.out.println(user == user2);*/

        //user.show();


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //�Ὣ���е�ʵ����������beans.xml�е�����bean���ᱻʵ��������
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
