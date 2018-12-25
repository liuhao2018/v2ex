package com.v2ex.mapper;

import com.v2ex.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: liuhao
 * @Date: 2018/12/24 17:11
 * @Description:
 */
@Mapper
public interface CommentMapper extends tk.mybatis.mapper.common.Mapper<Comment> {
}
