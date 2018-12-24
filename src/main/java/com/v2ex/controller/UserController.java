package com.v2ex.controller;

import com.v2ex.bo.UserBO;
import com.v2ex.bo.UserLoginBO;
import com.v2ex.entity.User;
import com.v2ex.service.UserService;
import com.v2ex.vo.CommonResponseVO;
import com.v2ex.vo.TokenVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 15:29
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public CommonResponseVO save(@RequestBody UserBO userBO) {
        CommonResponseVO vo = new CommonResponseVO();
        User user = new User();
        BeanUtils.copyProperties(userBO,user);
        int save = userService.save(user);
        if (save > 0) {
            vo.setCode(0);
            vo.setMessage("ok");
            return vo;
        }
        vo.setCode(-1);
        vo.setMessage("error");
        return vo;
    }

    @PostMapping("/login")
    public CommonResponseVO<TokenVO> login(@RequestBody UserLoginBO userLoginBO) {
        CommonResponseVO<TokenVO> vo = new CommonResponseVO<>();
        String token = userService.login(userLoginBO.getAccount(),userLoginBO.getPassword());
        if (token != null) {
            vo.setCode(0);
            vo.setMessage("ok");
            TokenVO tokenVO = new TokenVO();
            tokenVO.setToken(token);
            vo.setData(tokenVO);
            return vo;
        }
        vo.setCode(-1);
        vo.setMessage("error");
        return vo;
    }
}
