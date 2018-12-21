package com.v2ex.mapper;

import com.v2ex.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 15:32
 * @Description:
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
