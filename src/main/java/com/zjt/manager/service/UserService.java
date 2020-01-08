package com.zjt.manager.service;

import com.zjt.manager.mapper.UserMapper;
import com.zjt.manager.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    void insertUser(User user);


    List<User> list();
}
