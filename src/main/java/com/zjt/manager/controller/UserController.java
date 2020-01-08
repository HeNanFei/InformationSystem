package com.zjt.manager.controller;

import com.zjt.manager.pojo.User;
import com.zjt.manager.service.UserService;
import com.zjt.manager.util.Bcry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

   @Autowired
   private UserService userService;

   @RequestMapping("/usr/add")
   public String add(User user){

       String password = Bcry.bcry(user.getPassword());
       user.setPassword(password);
       userService.insertUser(user);

       return "添加成功";
   }

   @RequestMapping("/usr/list")
    public List<User> list(){


       return userService.list();
   }





}
