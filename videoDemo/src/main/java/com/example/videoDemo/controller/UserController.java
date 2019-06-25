package com.example.videoDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@CrossOrigin
public class UserController {
    @RequestMapping(value = "/home")
    public String home(){
    return "home";
    }

    @RequestMapping("/index")
    public String test(){
        return "index";
    }

        @RequestMapping("/user")
        @ResponseBody
        public String addSave(String card,String name, MultipartFile image){
            System.out.println("loginName->"+card);
            System.out.println("password->"+name);
            System.out.println("avatar->"+image);
            return "success";
        }
}
