package com.v2ex.controller;

import com.v2ex.bo.TopicBO;
import com.v2ex.entity.Comment;
import com.v2ex.entity.Topic;
import com.v2ex.service.TopicService;
import com.v2ex.vo.CommonResponseVO;
import com.v2ex.vo.TopicVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public CommonResponseVO<List<TopicVO>> findTopicByCategory(@RequestParam("categoryId")Integer categoryId) {
        CommonResponseVO vo = new CommonResponseVO();
        List<TopicVO> list = topicService.findTopicByCategory(categoryId);
        vo.setCode(0);
        vo.setMessage("ok");
        vo.setData(list);
        return vo;
    }

    @GetMapping("/{topicId}/comment")
    public CommonResponseVO<List<Comment>> findCommentByTopicId(@PathVariable("topicId")Integer topicId) {
        CommonResponseVO vo = new CommonResponseVO();
        List<Comment> list = topicService.findCommentByTopicId(topicId);
        vo.setCode(0);
        vo.setMessage("ok");
        vo.setData(list);
        return vo;
    }

}
