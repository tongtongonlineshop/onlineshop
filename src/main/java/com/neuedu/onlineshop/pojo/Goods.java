package com.neuedu.onlineshop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Integer typeid;

    private String imgpath;

    private Double price;

    private String goodsdesc;

    private Date createtime;
    
    private Integer state;
    
    

    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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
        this.name = name == null ? null : name.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc == null ? null : goodsdesc.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}