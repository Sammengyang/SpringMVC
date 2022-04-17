package com.zmy.springmvc.service;

import com.zmy.springmvc.pojo.User;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 11:38
 */
public interface UserService {

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);
}
