package com.v2ex.mapper;

import com.v2ex.entity.Node;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 16:44
 * @Description:
 */
@Mapper
public interface NodeMapper extends tk.mybatis.mapper.common.Mapper<Node> {

    @Select("select * from node where id in (select nid from category_node where cid = #{categoryId})")
    List<Node> findNodeByCategory(Integer categoryId);

}
