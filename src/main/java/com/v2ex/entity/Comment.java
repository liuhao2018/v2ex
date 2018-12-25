package com.v2ex.entity;

import javax.persistence.Column;
import java.util.Date;

/**
 * @Auther: liuhao
 * @Date: 2018/12/24 17:13
 * @Description:
 */
public class Comment {
    private Integer id;
    private String content;
    @Column(name = "topic_id")
    private Integer topicId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "create_date")
    private Date createDate;

    public Comment() {
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

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", topicId=" + topicId +
                ", userId=" + userId +
                ", createDate=" + createDate +
                '}';
    }
}
