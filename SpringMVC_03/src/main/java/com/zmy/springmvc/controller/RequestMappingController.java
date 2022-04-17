package com.zmy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 16:31
 */
@Controller
public class RequestMappingController {

    //此时请求映射所映射的请求的请求路径为：/hello/testRequestMapping
    @GetMapping(
            value = {"/testRequestMapping","/test"},
            params = {"username","password"},
            headers = {"Host=localhost:8080"}
    )
    public String testRequestMapping(){
        return "success";
    }


    @RequestMapping("/sam/{id}")
    public String zmy1(@PathVariable("id") String id){
        System.out.println("id = " + id);
        return "success";
    }
    @RequestMapping("/sam/{id}/{username}")
    public String zmy(
            @PathVariable("id") String id,
            @PathVariable("username") String username){
        System.out.println("id = " + id);
        System.out.println("username = " + username);
        return "success";
    }


}
