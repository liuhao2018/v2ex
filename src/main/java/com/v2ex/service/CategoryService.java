package com.v2ex.service;

import com.v2ex.entity.Category;
import com.v2ex.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/22 11:04
 * @Description:
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    public int save(Category category) {
        category.setCreateDate(new Date());
        return categoryMapper.insertSelective(category);
    }

    public int config(Integer cid,Integer nid) {
        return categoryMapper.configCategoryWithNode(cid,nid);
    }

    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }
}
