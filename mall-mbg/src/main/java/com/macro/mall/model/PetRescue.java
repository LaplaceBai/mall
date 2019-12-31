package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PetRescue implements Serializable {
    private Long id;

    private String name;

    private String pic;

    @ApiModelProperty(value = "商品重量，默认为克")
    private BigDecimal weight;

    private String keywords;

    private String note;

    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    private String detailTitle;

    @ApiModelProperty(value = "促销开始时间")
    private Date promotionStartTime;

    @ApiModelProperty(value = "促销结束时间")
    private Date promotionEndTime;

    @ApiModelProperty(value = "活动限购数量")
    private Integer promotionPerLimit;

    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "商品分类名称")
    private String productCategoryName;

    private String barcode;

    private Integer categoryid;

    private String characteristic;

    private Float commission;

    private Integer commissiontype;

    private Date dateadd;

    private Date datestart;

    private Date dateupdate;

    private Integer gotscore;

    private Integer gotscoretype;

    private Boolean kanjia;

    private BigDecimal kanjiaprice;

    private Boolean limitation;

    private Integer logisticsid;

    private Boolean miaosha;

    private BigDecimal minprice;

    private Integer numberfav;

    private Integer numbergoodreputation;

    private Integer numberorders;

    private Integer numbersells;

    private BigDecimal originalprice;

    private Integer paixu;

    private Boolean pingtuan;

    private BigDecimal pingtuanprice;

    private Integer recommendstatus;

    private String recommendstatusstr;

    private Integer shopid;

    private Integer status;

    private String statusstr;

    private Integer stores;

    private Integer userid;

    private Integer vetstatus;

    private String videoid;

    private Integer views;

    @ApiModelProperty(value = "商品描述")
    private String description;

    private String detailDesc;

    @ApiModelProperty(value = "产品详情网页内容")
    private String detailHtml;

    @ApiModelProperty(value = "移动端网页详情")
    private String detailMobileHtml;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public Float getCommission() {
        return commission;
    }

    public void setCommission(Float commission) {
        this.commission = commission;
    }

    public Integer getCommissiontype() {
        return commissiontype;
    }

    public void setCommissiontype(Integer commissiontype) {
        this.commissiontype = commissiontype;
    }

    public Date getDateadd() {
        return dateadd;
    }

    public void setDateadd(Date dateadd) {
        this.dateadd = dateadd;
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateupdate() {
        return dateupdate;
    }

    public void setDateupdate(Date dateupdate) {
        this.dateupdate = dateupdate;
    }

    public Integer getGotscore() {
        return gotscore;
    }

    public void setGotscore(Integer gotscore) {
        this.gotscore = gotscore;
    }

    public Integer getGotscoretype() {
        return gotscoretype;
    }

    public void setGotscoretype(Integer gotscoretype) {
        this.gotscoretype = gotscoretype;
    }

    public Boolean getKanjia() {
        return kanjia;
    }

    public void setKanjia(Boolean kanjia) {
        this.kanjia = kanjia;
    }

    public BigDecimal getKanjiaprice() {
        return kanjiaprice;
    }

    public void setKanjiaprice(BigDecimal kanjiaprice) {
        this.kanjiaprice = kanjiaprice;
    }

    public Boolean getLimitation() {
        return limitation;
    }

    public void setLimitation(Boolean limitation) {
        this.limitation = limitation;
    }

    public Integer getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(Integer logisticsid) {
        this.logisticsid = logisticsid;
    }

    public Boolean getMiaosha() {
        return miaosha;
    }

    public void setMiaosha(Boolean miaosha) {
        this.miaosha = miaosha;
    }

    public BigDecimal getMinprice() {
        return minprice;
    }

    public void setMinprice(BigDecimal minprice) {
        this.minprice = minprice;
    }

    public Integer getNumberfav() {
        return numberfav;
    }

    public void setNumberfav(Integer numberfav) {
        this.numberfav = numberfav;
    }

    public Integer getNumbergoodreputation() {
        return numbergoodreputation;
    }

    public void setNumbergoodreputation(Integer numbergoodreputation) {
        this.numbergoodreputation = numbergoodreputation;
    }

    public Integer getNumberorders() {
        return numberorders;
    }

    public void setNumberorders(Integer numberorders) {
        this.numberorders = numberorders;
    }

    public Integer getNumbersells() {
        return numbersells;
    }

    public void setNumbersells(Integer numbersells) {
        this.numbersells = numbersells;
    }

    public BigDecimal getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(BigDecimal originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getPaixu() {
        return paixu;
    }

    public void setPaixu(Integer paixu) {
        this.paixu = paixu;
    }

    public Boolean getPingtuan() {
        return pingtuan;
    }

    public void setPingtuan(Boolean pingtuan) {
        this.pingtuan = pingtuan;
    }

    public BigDecimal getPingtuanprice() {
        return pingtuanprice;
    }

    public void setPingtuanprice(BigDecimal pingtuanprice) {
        this.pingtuanprice = pingtuanprice;
    }

    public Integer getRecommendstatus() {
        return recommendstatus;
    }

    public void setRecommendstatus(Integer recommendstatus) {
        this.recommendstatus = recommendstatus;
    }

    public String getRecommendstatusstr() {
        return recommendstatusstr;
    }

    public void setRecommendstatusstr(String recommendstatusstr) {
        this.recommendstatusstr = recommendstatusstr;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusstr() {
        return statusstr;
    }

    public void setStatusstr(String statusstr) {
        this.statusstr = statusstr;
    }

    public Integer getStores() {
        return stores;
    }

    public void setStores(Integer stores) {
        this.stores = stores;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getVetstatus() {
        return vetstatus;
    }

    public void setVetstatus(Integer vetstatus) {
        this.vetstatus = vetstatus;
    }

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", weight=").append(weight);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", promotionStartTime=").append(promotionStartTime);
        sb.append(", promotionEndTime=").append(promotionEndTime);
        sb.append(", promotionPerLimit=").append(promotionPerLimit);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", barcode=").append(barcode);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", characteristic=").append(characteristic);
        sb.append(", commission=").append(commission);
        sb.append(", commissiontype=").append(commissiontype);
        sb.append(", dateadd=").append(dateadd);
        sb.append(", datestart=").append(datestart);
        sb.append(", dateupdate=").append(dateupdate);
        sb.append(", gotscore=").append(gotscore);
        sb.append(", gotscoretype=").append(gotscoretype);
        sb.append(", kanjia=").append(kanjia);
        sb.append(", kanjiaprice=").append(kanjiaprice);
        sb.append(", limitation=").append(limitation);
        sb.append(", logisticsid=").append(logisticsid);
        sb.append(", miaosha=").append(miaosha);
        sb.append(", minprice=").append(minprice);
        sb.append(", numberfav=").append(numberfav);
        sb.append(", numbergoodreputation=").append(numbergoodreputation);
        sb.append(", numberorders=").append(numberorders);
        sb.append(", numbersells=").append(numbersells);
        sb.append(", originalprice=").append(originalprice);
        sb.append(", paixu=").append(paixu);
        sb.append(", pingtuan=").append(pingtuan);
        sb.append(", pingtuanprice=").append(pingtuanprice);
        sb.append(", recommendstatus=").append(recommendstatus);
        sb.append(", recommendstatusstr=").append(recommendstatusstr);
        sb.append(", shopid=").append(shopid);
        sb.append(", status=").append(status);
        sb.append(", statusstr=").append(statusstr);
        sb.append(", stores=").append(stores);
        sb.append(", userid=").append(userid);
        sb.append(", vetstatus=").append(vetstatus);
        sb.append(", videoid=").append(videoid);
        sb.append(", views=").append(views);
        sb.append(", description=").append(description);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}