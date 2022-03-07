package com.hysea.hyseaappapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hysea.hyseaappapi.entity.User;
import com.hysea.hyseaappapi.mapper.UserMapper;
import com.hysea.hyseaappapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id){
        User user = userMapper.selectById(1);
        return user;
    }

    @Override
    public List<User> getUser(String name, String password){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("user.id");
        queryWrapper.eq("name",name);
        queryWrapper.eq("password",password);
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public Integer addUser(String name,String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        userMapper.insert(user);
        return user.getId();
    }
}
