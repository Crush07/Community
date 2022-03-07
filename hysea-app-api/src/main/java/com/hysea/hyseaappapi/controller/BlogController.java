package com.hysea.hyseaappapi.controller;

import com.hysea.hyseaappapi.entity.Blog;
import com.hysea.hyseaappapi.entity.User;
import com.hysea.hyseaappapi.service.BlogService;
import com.hysea.hyseaappapi.utils.ResultUtils;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@Api(value = "登录模块")
public class BlogController {

    private BlogService blogService;
    private ResultUtils resultUtils;

    public BlogController(BlogService blogService, ResultUtils resultUtils) {
        this.blogService = blogService;
        this.resultUtils = resultUtils;
    }

    /**登录**/
    @RequestMapping(value = "/getAllBlog",method = RequestMethod.GET)
    @ResponseBody
    public String getAllBlog(){
        List<Blog> blogByStarDesc = blogService.getBlogByStarDesc();
        return resultUtils.SUCCESS("成功",blogByStarDesc);
    }

    /**登录**/
    @RequestMapping(value = "/addBlog",method = RequestMethod.GET)
    @ResponseBody
    public String addBlog(@RequestBody Blog blog){
        blog.setCreateTime(new Date());
        Integer blogId = blogService.addBlog(blog);
        return resultUtils.SUCCESS("成功",blogId);
    }
}
