package com.v2ex.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 17:27
 * @Description:
 */
@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "create_date")
    private Date createDate;
    private String title;
    private String content;
    @Column(name = "node_id")
    private Integer nodeId;
    @Column(name = "user_id")
    private Integer userId;

    public Topic() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", nodeId=" + nodeId +
                ", userId=" + userId +
                '}';
    }
}
