package com.v2ex.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/24 10:46
 * @Description:
 */
public class TopicVO {
    private Integer id;
    private String title;
    private String userName;
    private String userAvatar;
    private String nodeName;
    private Date createDate;
    private Integer totalComment;
    @JsonIgnore
    private List<CommentVO> commentVOList;

    private CommentVO lastComment;

    public TopicVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<CommentVO> getCommentVOList() {
        return commentVOList;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCommentVOList(List<CommentVO> commentVOList) {
        this.commentVOList = commentVOList;
    }

    public CommentVO getLastComment() {
        return lastComment;
    }

    public void setLastComment(CommentVO lastComment) {
        this.lastComment = lastComment;
    }

    public Integer getTotalComment() {
        return totalComment;
    }

    public void setTotalComment(Integer totalComment) {
        this.totalComment = totalComment;
    }
}
