package com.zmy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 9:20
 */
@Controller
public class MyController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
