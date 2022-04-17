package com.zmy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 15:47
 */
@Controller
public class MyController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

}
