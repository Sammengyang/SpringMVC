package com.zmy.springmvc.pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 10:16
 */
@Controller
public class MyController {

    @RequestMapping ("/add")
    private String add(){
        System.out.println("success...........");
        return "success";
    }
}
