package com.hysea.hyseaappapi.service;

import com.hysea.hyseaappapi.entity.Topic;
import com.hysea.hyseaappapi.entity.User;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface TopicService {

    Topic getTopicById(Integer id);

    List<Topic> getAllTopic();

    Integer addTopic(Topic topic);
}
