package com.zjt.manager.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Component
@EnableWebSecurity
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/test")
    public String test(){

        return "layui";
    }
    @RequestMapping("/hello")
    public String hello(){


        return "index";
    }
    @ResponseBody
    @RequestMapping("/test/layui")
    public String testLayui(String msg){
        System.out.println(msg);
        return "nothing";
    }
    @RequestMapping("/success")
    public String success(){


        return "layui";
    }

}
