package com.hysea.hyseaappapi.service;

import com.hysea.hyseaappapi.entity.User;

import java.util.List;

public interface UserService {

    User getUserById(Integer id);

    List<User> getUser(String name, String password);

    Integer addUser(String name,String password);
}
