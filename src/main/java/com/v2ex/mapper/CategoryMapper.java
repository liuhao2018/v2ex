package com.v2ex.mapper;

import com.v2ex.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: liuhao
 * @Date: 2018/12/22 11:03
 * @Description:
 */
@Mapper
public interface CategoryMapper extends tk.mybatis.mapper.common.Mapper<Category> {
    @Insert("insert into category_node (cid,nid) values (#{cid},#{nid})")
    int configCategoryWithNode(@Param("cid")Integer cid, @Param("nid")Integer nid);
}
