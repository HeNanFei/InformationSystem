package com.zjt.manager.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
   @ResponseBody
   @RequestMapping("/usr/add")
   public String add(String user1){
       System.out.println(user1);


       User user2 = JSONObject.parseObject(user1, User.class);


       String password = Bcry.bcry(user2.getPassword());
       user2.setPassword(password);
       userService.insertUser(user2);

       return "添加成功";
   }

   @RequestMapping("/usr/list")
    public List<User> list(){


       return userService.list();
   }





}
