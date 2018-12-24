package com.v2ex.vo;


/**
 * @Auther: liuhao
 * @Date: 2018/12/24 10:26
 * @Description:
 */
public class NodeVO {
    private Integer id;
    private String name;
    private Integer top;
    private Integer parentId;

    public NodeVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
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
        return "NodeVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", top=" + top +
                ", parentId=" + parentId +
                '}';
    }
}
