package com.zmy.springmv.controller;

import com.zmy.springmv.pojo.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-18 16:09
 */
@Controller
public class HttpController {

    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody = " + requestBody);
        return "success";
    }
    @PostMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        // 当前requestEntrty表示整个请求报文的信息
        System.out.println("请求头 = " + requestEntity.getHeaders());
        System.out.println("请求体 = " + requestEntity.getBody());
        return "success";
    }
    @RequestMapping("/testResponse")
    @ResponseBody
    public String testResponse(){
        return "success";
    }
    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1001,"sasf","sfas");
    }
    @RequestMapping("/testResponseAjax")
    @ResponseBody
    public String testResponseAjax(String user,String password){
        System.out.println("user = " + user);
        System.out.println("password = " + password);
        return "success";
    }




}
