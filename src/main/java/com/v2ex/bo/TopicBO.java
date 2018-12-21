package com.v2ex.bo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 17:34
 * @Description:
 */
public class TopicBO {
    private String title;
    private String content;
    private Integer nodeId;
    private Integer userId;

    public TopicBO() {
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
        return "TopicBO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", nodeId=" + nodeId +
                ", userId=" + userId +
                '}';
    }
}
