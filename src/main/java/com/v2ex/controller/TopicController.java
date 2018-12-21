package com.v2ex.controller;

import com.v2ex.bo.TopicBO;
import com.v2ex.entity.Topic;
import com.v2ex.service.TopicService;
import com.v2ex.vo.CommonResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 17:33
 * @Description:
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping
    public CommonResponseVO save(@RequestBody TopicBO topicBO) {
        CommonResponseVO vo = new CommonResponseVO();
        Topic topic = new Topic();
        BeanUtils.copyProperties(topicBO,topic);
        int save = topicService.save(topic);
        if (save > 0) {
            vo.setCode(0);
            vo.setMessage("ok");
            return vo;
        }
        vo.setCode(-1);
        vo.setMessage("error");
        return vo;
    }

}
