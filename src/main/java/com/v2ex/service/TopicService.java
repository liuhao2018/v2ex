package com.v2ex.service;

import com.v2ex.entity.Comment;
import com.v2ex.entity.Topic;
import com.v2ex.mapper.CommentMapper;
import com.v2ex.mapper.TopicMapper;
import com.v2ex.vo.CommentVO;
import com.v2ex.vo.TopicVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 17:31
 * @Description:
 */
@Service
public class TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Autowired
    private CommentMapper commentMapper;

    public int save(Topic topic) {
        topic.setCreateDate(new Date());
        return topicMapper.insertSelective(topic);
    }

    public List<TopicVO> findTopicByCategory(Integer categoryId) {
        List<TopicVO> list = topicMapper.findTopicByCategory(categoryId);
        if (list != null && list.size() > 0) {
            for (TopicVO topicVO :list) {
                topicVO.setTotalComment(topicVO.getCommentVOList().size() == 0 ? 0:topicVO.getCommentVOList().size());
                topicVO.setLastComment(topicVO.getCommentVOList().size() == 0 ? null:topicVO.getCommentVOList().get(0));
            }
        }
        return list;
    }

    public List<Comment> findCommentByTopicId(Integer topicId) {
        Example example = new Example(Comment.class);
        example.setOrderByClause("create_date desc");
        example.createCriteria().andEqualTo("topicId",topicId);
        return commentMapper.selectByExample(example);
    }

}
