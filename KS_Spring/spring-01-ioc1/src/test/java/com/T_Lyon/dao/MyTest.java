package com.T_Lyon.dao;


import com.T_Lyon.pojo.User;
import com.T_Lyon.service.UserService;
import com.T_Lyon.service.UserServiceImpl;
import org.junit.Test;


public class MyTest {
    @Test
    public void getUser() {
        UserService userService = new UserServiceImpl();
        //大范围变小范围。从Service对象变成ServiceImpl对象
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        User user = userService.getUser();
    }
}
