package com.hysea.hyseaappapi.service;

import com.hysea.hyseaappapi.entity.Blog;
import com.hysea.hyseaappapi.entity.User;

import java.util.List;

public interface BlogService {


    Blog getBlogById(Integer userId);

    List<Blog> getBlogByUserId(Integer userId);

    List<Blog> getBlogByStarDesc();

    Integer addBlog(Blog blog);
}
