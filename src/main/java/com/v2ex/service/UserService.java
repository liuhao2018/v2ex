package com.v2ex.service;

import com.v2ex.entity.User;
import com.v2ex.mapper.UserMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.security.Key;
import java.util.Date;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 15:33
 * @Description:
 */
@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public int save(User user) {
        user.setCreateDate(new Date());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userMapper.insertSelective(user);
    }

    public String login(String email,String password) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("email",email);
        User user = userMapper.selectOneByExample(example);
        if (user == null) {
            return null;
        }
        if (passwordEncoder.matches(password,user.getPassword())) {
            Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
            String jws = Jwts.builder().setSubject(user.getUserName()).signWith(key).compact();
            return jws;
        }
        return null;
    }
}
