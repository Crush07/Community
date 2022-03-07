package com.hysea.hyseaappapi.controller;

import com.hysea.hyseaappapi.entity.User;
import com.hysea.hyseaappapi.service.UserService;
import com.hysea.hyseaappapi.utils.ResultUtils;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "登录模块")
public class LoginController {

    private final UserService userService;
    private final ResultUtils resultUtils;

    public LoginController(UserService userService, ResultUtils resultUtils) {
        this.userService = userService;
        this.resultUtils = resultUtils;
    }

    /**登录**/
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam("name") String name,
                        @RequestParam("password") String password){
        List<User> user = userService.getUser(name, password);
        if(user.size() > 0){
            return resultUtils.SUCCESS("成功",user.get(0).getId());
        }else{
            return resultUtils.WARNING("失败");
        }
    }

    /**注册**/
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @ResponseBody
    public String register(@RequestParam("name") String name,
                           @RequestParam("password") String password){
        try{
            Integer userId = userService.addUser(name, password);
            return resultUtils.SUCCESS("成功",userId);
        }catch (Exception e){
            return resultUtils.WARNING("失败");
        }
    }

}
