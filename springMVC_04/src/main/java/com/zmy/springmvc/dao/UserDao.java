package com.zmy.springmvc.dao;

import com.zmy.springmvc.pojo.User;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 11:51
 */
public interface UserDao {
    /**
     * 通过用户名，密码查询用户
     * @param user
     * @return
     */
    User getUserBnameAndPassword(User user);
}
