package com.zmy.springmvc.dao;

import com.zmy.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 11:52
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User getUserBnameAndPassword(User user) {
        String sql = "select * from user  where uname=? and upassword=?";
        jdbcTemplate.query(sql,user.getUname(),user.getUpassword());
        return null;
    }
}
