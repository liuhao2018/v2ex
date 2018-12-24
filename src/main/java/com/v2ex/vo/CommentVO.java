package com.v2ex.vo;

import java.util.Date;

/**
 * @Auther: liuhao
 * @Date: 2018/12/24 14:25
 * @Description:
 */
public class CommentVO {
    private Integer id;
    private String content;
    private Date createDate;
    private String userName;

    public CommentVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
