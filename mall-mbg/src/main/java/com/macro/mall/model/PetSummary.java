package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PetSummary implements Serializable {
    @ApiModelProperty(value = "宠物列表页")
    private Long id;

    @ApiModelProperty(value = "宠物编号")
    private String petid;

    @ApiModelProperty(value = "宠物中文名")
    private String name;

    @ApiModelProperty(value = "宠物英文名")
    private String engname;

    private String price;

    @ApiModelProperty(value = "宠物网址")
    private String coverurl;

    @ApiModelProperty(value = "宠物类型")
    private String type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetid() {
        return petid;
    }

    public void setPetid(String petid) {
        this.petid = petid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", petid=").append(petid);
        sb.append(", name=").append(name);
        sb.append(", engname=").append(engname);
        sb.append(", price=").append(price);
        sb.append(", coverurl=").append(coverurl);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}