package com.zmy.springmvc.service;

import com.zmy.springmvc.dao.UserDao;
import com.zmy.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 11:39
 */
@Repository
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User login(User user) {
        userDao.getUserBnameAndPassword(user);
        return user;
    }
}
