package com.v2ex.vo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/24 10:14
 * @Description:
 */
public class CategoryVO {
    private Integer id;
    private String name;

    public CategoryVO() {
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

    @Override
    public String toString() {
        return "CategoryVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
