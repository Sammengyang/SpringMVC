package com.zmy.springmvc.dao;

import com.zmy.springmvc.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-17 21:52
 */
@Repository
public class UserDaoImpl {
    private static Map<Integer, User> userMap = null;
    static {
        userMap = new HashMap<Integer,User>();
        userMap.put(1001,new User(1001,"AA","1"));
        userMap.put(1002,new User(1002,"BB","1"));
        userMap.put(1003,new User(1003,"CC","1"));
        userMap.put(1004,new User(1004,"DD","1"));
        userMap.put(1005,new User(1005,"EE","1"));
    }
    private static Integer initId = 1006;
    public void save(User user){
        if (user.getUid() == null){
            user.setUid(initId++);
        }
        userMap.put(user.getUid(),user);
    }
    public Collection<User> getAllUser(){
        return userMap.values();
    }
    public User getUser(Integer uid){
        return userMap.get(uid);
    }
    public void delete(Integer uid){
        userMap.remove(uid);
    }
}
