package com.hysea.hyseaappapi.controller;

import com.hysea.hyseaappapi.entity.Blog;
import com.hysea.hyseaappapi.entity.Topic;
import com.hysea.hyseaappapi.service.TopicService;
import com.hysea.hyseaappapi.utils.ResultUtils;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@Api(value = "登录模块")
public class TopicController {

    private TopicService topicService;
    private ResultUtils resultUtils;

    public TopicController(TopicService topicService, ResultUtils resultUtils) {
        this.topicService = topicService;
        this.resultUtils = resultUtils;
    }

    /**登录**/
    @RequestMapping(value = "/getAllTopic",method = RequestMethod.GET)
    @ResponseBody
    public String getAllTopic(){
        List<Topic> allTopic = topicService.getAllTopic();
        return resultUtils.SUCCESS("成功",allTopic);
    }

    /**登录**/
    @RequestMapping(value = "/addTopic",method = RequestMethod.GET)
    @ResponseBody
    public String addTopic(@RequestBody Topic topic){
        Integer topicId = topicService.addTopic(topic);
        return resultUtils.SUCCESS("成功",topicId);
    }

}
