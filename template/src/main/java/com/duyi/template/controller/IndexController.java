package com.duyi.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexController {
    //初测thymeleaf的请求
    @RequestMapping("/ftl")
    public String indexData(Model model){
        //利用model带走数据
        model.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }






}
