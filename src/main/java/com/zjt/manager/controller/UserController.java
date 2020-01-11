package com.zjt.manager.controller;
import com.alibaba.fastjson.JSONObject;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjt.manager.mapper.UserMapper;
import com.zjt.manager.pojo.User;
import com.zjt.manager.service.UserService;
import com.zjt.manager.util.Bcry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
   @Autowired
   private UserService userService;

   @RequestMapping("/usr/add")
   public String add(String user1){
       System.out.println(user1);
       User user2 = JSONObject.parseObject(user1, User.class);
       String password = Bcry.bcry(user2.getPassword());
       user2.setPassword(password);
       userService.insertUser(user2);

       return "添加成功";
   }
    int temp = 0;
   @RequestMapping("/usr/list")
    public Map list(Integer page,Integer limit){
       List<User> list1 = userMapper.selectByLimit((page-1)*limit, limit-1);
       List<User> list = userService.list();

       /*PageHelper.startPage(page,limit);
       List<User> list = userService.list();
       PageInfo<User> pageInfo = new PageInfo<>(list);

       List<User> list1 = pageInfo.getList();*/

       Map<String,Object> map = new HashMap<>();
       map.put("code",0);
       map.put("msg","");
       map.put("count",list.size());
       map.put("data",list1);

       return map;
   }





}
