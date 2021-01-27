package com.guojiayikao.dubbo.entity;

import java.io.Serializable;
public class Goods implements Serializable {
    private Integer id;

    private String goodsname;

    private Integer goodsuse;

    private String goodsimg;

    private Integer status;

    private Integer goodstype;

    private Integer isLuckdraw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodsuse() {
        return goodsuse;
    }

    public void setGoodsuse(Integer goodsuse) {
        this.goodsuse = goodsuse;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg == null ? null : goodsimg.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public Integer getIsLuckdraw() {
        return isLuckdraw;
    }

    public void setIsLuckdraw(Integer isLuckdraw) {
        this.isLuckdraw = isLuckdraw;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", goodsuse=" + goodsuse +
                ", goodsimg='" + goodsimg + '\'' +
                ", status=" + status +
                ", goodstype=" + goodstype +
                ", isLuckdraw=" + isLuckdraw +
                '}';
    }
}