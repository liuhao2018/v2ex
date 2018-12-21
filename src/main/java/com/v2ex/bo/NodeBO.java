package com.v2ex.bo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 16:42
 * @Description:
 */
public class NodeBO {
    private String name;
    private Boolean top;
    private Integer parentId;

    public NodeBO() {
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
        return "NodeBO{" +
                "name='" + name + '\'' +
                ", top=" + top +
                ", parentId=" + parentId +
                '}';
    }
}
