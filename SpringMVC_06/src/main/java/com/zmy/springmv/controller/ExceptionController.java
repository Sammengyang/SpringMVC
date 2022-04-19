package com.zmy.springmv.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-19 11:46
 */
@ControllerAdvice
public class ExceptionController {

    //value 值为异常类型数组
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String handleArithmeticException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
