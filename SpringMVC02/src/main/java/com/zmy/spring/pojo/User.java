package com.zmy.spring.pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 11:26
 */
@Controller
public class User {

    @RequestMapping("/test")
    public String test(){
        System.out.println(".....................");
        return "success";
    }
}
