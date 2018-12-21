package com.v2ex.service;

import com.v2ex.entity.Topic;
import com.v2ex.mapper.TopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 17:31
 * @Description:
 */
@Service
public class TopicService {

    @Autowired
    private TopicMapper topicMapper;


    public int save(Topic topic) {
        topic.setCreateDate(new Date());
        return topicMapper.insertSelective(topic);
    }

}
