package com.zmy.springmvc.controller;

import com.zmy.springmvc.dao.UserDaoImpl;
import com.zmy.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-17 19:55
 */
@Controller
public class UserController {

    @Autowired
    private UserDaoImpl userDao;


    /**
     * 使用RESTFul模拟用户资源测增删改查
     * /user        GET     查询所有信息
     * /user/1        GET     根据id查询用户信息
     * /user        post     添加用户信息
     * /user/1        delete     删除用户信息
     * /user        put     更新用户信息
     */
    @GetMapping(value = "/user")
    public String getAllUser(Model model){
        System.out.println("查询所有用户信息");
        Collection<User> userlist = userDao.getAllUser();
        model.addAttribute("userlist",userlist);
        return"userlist";
    }
    @GetMapping(value = "/user/{uid}")
    public String getUserById(@PathVariable("uid") Integer uid,Model model){
        System.out.println("根据id查询用户信息");
        System.out.println("uid = " + uid);
        User user = userDao.getUser(uid);
        model.addAttribute("user",user);
        return"update";
    }
    @PostMapping(value = "/user")
    public String InsertUser(User user){
        System.out.println(user.toString());
        userDao.save(user);
        System.out.println("添加用户");
        return "redirect:/user";
    }
    @PutMapping("/user")
    public String updateUser(User user){
        System.out.println("修改用户信息");
        userDao.save(user);
        return "redirect:/user";
    }
    @DeleteMapping ("/user/{uid}")
    public String DeleteUser(@PathVariable("uid") Integer uid){
        System.out.println("删除用户");
        userDao.delete(uid);
        return "redirect:/user";
    }






}
