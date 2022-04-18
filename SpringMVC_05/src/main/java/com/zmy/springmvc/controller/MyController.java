package com.zmy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-17 14:19
 */
@Controller
public class MyController {

    @RequestMapping("/testRequest")
    public String testRequest(HttpServletRequest request){
        request.setAttribute("testRequest","testRequest");
        return "success";
    }
    @RequestMapping("/testModeAdnView")
    public ModelAndView testModeAdnView(){
        ModelAndView view = new ModelAndView();
        // 处理模型数据，向请求域request贡献数据
        view.addObject("testModeAdnView","testModeAdnView");
        // 设置视图名称
        view.setViewName("success");
        return view;
    }
    @RequestMapping("/testMode")
    public String testMode(Model model){
        model.addAttribute("testMode","testMode");
        return "success";
    }
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testMap","testMap");
        return "success";
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testModelMap","testModelMap");
        modelMap.put("testModelMap2","testModelMap2");
        return "success";
    }
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSession","testSession");
        // 获取ServletContext对象
        ServletContext application = session.getServletContext();
        application.setAttribute("application","application");
        return "success";
    }

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        System.out.println("testThymeleafView");
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        System.out.println("testForward");
        return "forward:/testThymeleafView";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testForward";
    }

    @RequestMapping("/mvc")
    public String mvc(){
        return "success";
    }

    @GetMapping("/postMan")
    public String getReq(){
        System.out.println("sss" +"sss");
        return "success";
    }



}
