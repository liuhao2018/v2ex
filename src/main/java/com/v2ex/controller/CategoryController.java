package com.v2ex.controller;

import com.v2ex.bo.CategoryBO;
import com.v2ex.bo.CategoryNodeBO;
import com.v2ex.entity.Category;
import com.v2ex.service.CategoryService;
import com.v2ex.vo.CategoryVO;
import com.v2ex.vo.CommonResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/22 11:06
 * @Description:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public CommonResponseVO save(@RequestBody CategoryBO categoryBO) {
        CommonResponseVO vo = new CommonResponseVO();
        Category category = new Category();
        BeanUtils.copyProperties(categoryBO,category);
        int save = categoryService.save(category);
        if (save > 0) {
            vo.setCode(0);
            vo.setMessage("ok");
            return vo;
        }
        vo.setCode(-1);
        vo.setMessage("error");
        return vo;
    }

    @PostMapping("/node")
    public CommonResponseVO config(@RequestBody CategoryNodeBO categoryNodeBO) {
        CommonResponseVO vo = new CommonResponseVO();
        int config = categoryService.config
                (categoryNodeBO.getCid(),categoryNodeBO.getNid());
        if (config > 0) {
            vo.setCode(0);
            vo.setMessage("ok");
            return vo;
        }
        vo.setCode(-1);
        vo.setMessage("error");
        return vo;
    }

    @GetMapping
    public CommonResponseVO<List<CategoryVO>> findAll() {
        CommonResponseVO vo = new CommonResponseVO();
        List<Category> list = categoryService.findAll();
        if (list != null && list.size() > 0) {
            List<CategoryVO> categoryBOList = new ArrayList<>();
            for (Category category:list) {
                CategoryVO categoryVO = new CategoryVO();
                BeanUtils.copyProperties(category,categoryVO);
                categoryBOList.add(categoryVO);
            }
            vo.setCode(0);
            vo.setMessage("ok");
            vo.setData(categoryBOList);
            return vo;
        }
        vo.setCode(0);
        vo.setMessage("ok");
        return vo;
    }
}
