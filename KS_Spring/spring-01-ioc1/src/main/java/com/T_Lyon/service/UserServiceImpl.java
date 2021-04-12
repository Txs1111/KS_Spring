package com.T_Lyon.service;

import com.T_Lyon.dao.UserDao;
import com.T_Lyon.dao.UserDaoImpl;
import com.T_Lyon.pojo.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser() {
        userDao.getUser();
        return null;
    }
}
