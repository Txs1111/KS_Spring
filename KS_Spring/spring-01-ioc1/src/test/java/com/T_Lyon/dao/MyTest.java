package com.T_Lyon.dao;


import com.T_Lyon.pojo.User;
import com.T_Lyon.service.UserService;
import com.T_Lyon.service.UserServiceImpl;
import org.junit.Test;


public class MyTest {
    @Test
    public void getUser() {
        UserService userService = new UserServiceImpl();
        //��Χ��С��Χ����Service������ServiceImpl����
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        User user = userService.getUser();
    }
}
