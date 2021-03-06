package com.v2ex.mapper;

import com.v2ex.entity.Topic;
import com.v2ex.vo.TopicVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 17:31
 * @Description:
 */
@org.apache.ibatis.annotations.Mapper
public interface TopicMapper extends Mapper<Topic> {
    List<TopicVO> findTopicByCategory(Integer categoryId);
}
