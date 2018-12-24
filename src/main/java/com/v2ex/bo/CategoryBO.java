package com.v2ex.bo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/22 11:07
 * @Description:
 */
public class CategoryBO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryBO() {

    }

    @Override
    public String toString() {
        return "CategoryBO{" +
                "name='" + name + '\'' +
                '}';
    }
}
