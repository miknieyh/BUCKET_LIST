package com.hye.bucket_list_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("hello","테스트 메세지 입니다.");
        return "/index";
    }
}
