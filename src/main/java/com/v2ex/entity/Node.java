package com.v2ex.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 16:38
 * @Description:
 */
@Entity
@Table(name = "node")
public class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date createDate;
    private String name;
    @Column(name = "is_top")
    private Boolean top;
    private Integer parentId;

    public Node() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", name='" + name + '\'' +
                ", top=" + top +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
