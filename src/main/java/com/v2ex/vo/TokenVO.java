package com.v2ex.vo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 15:37
 * @Description:
 */
public class TokenVO {
    private String token;

    public TokenVO() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TokenVO{" +
                "token='" + token + '\'' +
                '}';
    }
}
