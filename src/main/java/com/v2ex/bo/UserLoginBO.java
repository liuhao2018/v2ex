package com.v2ex.bo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 16:17
 * @Description:
 */
public class UserLoginBO {
    private String account;
    private String password;

    public UserLoginBO() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginBO{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
