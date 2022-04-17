package com.zmy.springmvc.controller;

import com.zmy.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-17 19:55
 */
@Controller
public class UserController {
    /**
     * 使用RESTFul模拟用户资源测增删改查
     * /user        GET     查询所有信息
     * /user/1        GET     根据id查询用户信息
     * /user        post     添加用户信息
     * /user/1        delete     删除用户信息
     * /user        put     更新用户信息
     */
    @GetMapping(value = "/user")
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return"success";
    }
    @GetMapping(value = "/user/{uid}")
    public String getUserById(){
        System.out.println("根据id查询用户信息");
        return"success";
    }
    @PostMapping(value = "/user")
    public String InsertUser(User user){
        System.out.println("添加用户");
        return"success";
    }
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息");
        return "success";
    }
    @DeleteMapping ("/user")
    public String DeleteUser(){
        System.out.println("删除用户");
        return "success";
    }






}
