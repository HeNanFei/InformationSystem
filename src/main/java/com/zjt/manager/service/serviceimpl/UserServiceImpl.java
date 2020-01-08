package com.zjt.manager.service.serviceimpl;

import com.zjt.manager.mapper.UserMapper;
import com.zjt.manager.pojo.User;
import com.zjt.manager.pojo.UserExample;
import com.zjt.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> list() {
        UserExample userExample = new UserExample();

        UserExample.Criteria criteria = userExample.createCriteria();

        criteria.andUidIsNotNull();

        return userMapper.selectByExample(userExample);
    }


}
