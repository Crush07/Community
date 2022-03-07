package com.hysea.hyseaappapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.yulichang.query.MPJQueryWrapper;
import com.hysea.hyseaappapi.entity.Blog;
import com.hysea.hyseaappapi.entity.User;
import com.hysea.hyseaappapi.entity.UserAction;
import com.hysea.hyseaappapi.mapper.BlogMapper;
import com.hysea.hyseaappapi.mapper.UserActionMapper;
import com.hysea.hyseaappapi.mapper.UserMapper;
import com.hysea.hyseaappapi.service.BlogService;
import com.hysea.hyseaappapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
@Service
public class BlogServiceImp implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private UserActionMapper userActionMapper;

    @Override
    public Blog getBlogById(Integer userId) {
        Blog blog = blogMapper.selectById(userId);
        return blog;
    }

    @Override
    public List<Blog> getBlogByUserId(Integer userId) {
        QueryWrapper<Blog> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("blog.*");
        queryWrapper.eq("user_id",userId);
        List<Blog> blogs = blogMapper.selectList(queryWrapper);
        return blogs;
    }

    @Override
    public List<Blog> getBlogByStarDesc() {
        QueryWrapper<Blog> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("blog.*");
        queryWrapper.gt("create_time", new Date(new Date().getTime() - 2 * 24 * 60 * 60 * 1000L));
        queryWrapper.orderByDesc("like_num");
        List<Blog> blogs = blogMapper.selectList(queryWrapper);
        return blogs;
    }

    @Override
    public Integer addBlog(Blog blog) {
        blogMapper.insert(blog);
        return blog.getId();
    }
}
