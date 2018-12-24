package com.v2ex.bo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/22 11:23
 * @Description:
 */
public class CategoryNodeBO {
    private Integer cid;
    private Integer nid;

    public CategoryNodeBO() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    @Override
    public String toString() {
        return "CategoryNodeBO{" +
                "cid=" + cid +
                ", nid=" + nid +
                '}';
    }
}
