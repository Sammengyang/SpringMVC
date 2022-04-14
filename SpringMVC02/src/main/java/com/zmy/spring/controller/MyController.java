package com.zmy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 14:30
 */
@Controller
public class MyController {

    //@RequestMapping注解：处理请求和控制器方法之间的映射关系
    @RequestMapping("/t")
    public String adds(){
        // 返回视图名称
        return "test";
    }

    @RequestMapping("/success")
    public String success(){
        // 返回视图名称
        return "success";
    }


}
