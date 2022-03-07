package com.hysea.hyseaappapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hysea.hyseaappapi.entity.Topic;
import com.hysea.hyseaappapi.entity.User;
import com.hysea.hyseaappapi.mapper.TopicMapper;
import com.hysea.hyseaappapi.mapper.UserMapper;
import com.hysea.hyseaappapi.service.TopicService;
import com.hysea.hyseaappapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TopicServiceImp implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public Topic getTopicById(Integer id) {
        Topic topic = topicMapper.selectById(id);
        return topic;
    }

    @Override
    public List<Topic> getAllTopic() {
        QueryWrapper<Topic> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("topic.*");
        List<Topic> topics = topicMapper.selectList(queryWrapper);
        return topics;
    }

    @Override
    public Integer addTopic(Topic topic) {
        topicMapper.insert(topic);
        return topic.getId();
    }
}
