package com.zmy.springmvc.controller;

import com.zmy.springmvc.pojo.User;
import com.zmy.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 9:47
 */
@Controller
@RequestMapping("/user1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login1")
    public String login1(@RequestParam("uname")String uname,
                        @RequestParam("upassword") String upassword,
                        Map<String,Object> map){
        System.out.println("UserController---->" + uname+":"+upassword);
        // 登录成功
        /**
         * 调用service   todo
         */
        /*
            将数据放入到map中
         */
        map.put("uname",uname);
        return "home";
    }
    @PostMapping("/login2")
    public String login2(@RequestParam("uname")String uname,
                        @RequestParam("upassword") String upassword,
                        Model model){
        System.out.println("UserController---->" + uname+":"+upassword);
        // 登录成功
        /**
         * 调用service   todo
         */
        /*
            将数据放入到model中
         */
        model.addAttribute("uname",uname);
        return "home";
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam("uname")String uname,
                              @RequestParam("upassword") String upassword,
                              ModelAndView view){
        System.out.println("UserController---->" + uname+":"+upassword);
        // 登录成功
        /**
         * 调用service   todo
         */
        /*
            将数据放入到 view 中
         */
        view.addObject("uname",uname);
        view.setViewName("home");
        return view;
    }
}
