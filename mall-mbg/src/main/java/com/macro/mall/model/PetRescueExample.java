package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetRescueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetRescueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsIsNull() {
            addCriterion("album_pics is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsIsNotNull() {
            addCriterion("album_pics is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsEqualTo(String value) {
            addCriterion("album_pics =", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotEqualTo(String value) {
            addCriterion("album_pics <>", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsGreaterThan(String value) {
            addCriterion("album_pics >", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsGreaterThanOrEqualTo(String value) {
            addCriterion("album_pics >=", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsLessThan(String value) {
            addCriterion("album_pics <", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsLessThanOrEqualTo(String value) {
            addCriterion("album_pics <=", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsLike(String value) {
            addCriterion("album_pics like", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotLike(String value) {
            addCriterion("album_pics not like", value, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsIn(List<String> values) {
            addCriterion("album_pics in", values, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotIn(List<String> values) {
            addCriterion("album_pics not in", values, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsBetween(String value1, String value2) {
            addCriterion("album_pics between", value1, value2, "albumPics");
            return (Criteria) this;
        }

        public Criteria andAlbumPicsNotBetween(String value1, String value2) {
            addCriterion("album_pics not between", value1, value2, "albumPics");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNull() {
            addCriterion("detail_title is null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNotNull() {
            addCriterion("detail_title is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleEqualTo(String value) {
            addCriterion("detail_title =", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotEqualTo(String value) {
            addCriterion("detail_title <>", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThan(String value) {
            addCriterion("detail_title >", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("detail_title >=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThan(String value) {
            addCriterion("detail_title <", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThanOrEqualTo(String value) {
            addCriterion("detail_title <=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLike(String value) {
            addCriterion("detail_title like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotLike(String value) {
            addCriterion("detail_title not like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIn(List<String> values) {
            addCriterion("detail_title in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotIn(List<String> values) {
            addCriterion("detail_title not in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleBetween(String value1, String value2) {
            addCriterion("detail_title between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotBetween(String value1, String value2) {
            addCriterion("detail_title not between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIsNull() {
            addCriterion("promotion_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIsNotNull() {
            addCriterion("promotion_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeEqualTo(Date value) {
            addCriterion("promotion_start_time =", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotEqualTo(Date value) {
            addCriterion("promotion_start_time <>", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeGreaterThan(Date value) {
            addCriterion("promotion_start_time >", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promotion_start_time >=", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeLessThan(Date value) {
            addCriterion("promotion_start_time <", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("promotion_start_time <=", value, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeIn(List<Date> values) {
            addCriterion("promotion_start_time in", values, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotIn(List<Date> values) {
            addCriterion("promotion_start_time not in", values, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeBetween(Date value1, Date value2) {
            addCriterion("promotion_start_time between", value1, value2, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("promotion_start_time not between", value1, value2, "promotionStartTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIsNull() {
            addCriterion("promotion_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIsNotNull() {
            addCriterion("promotion_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeEqualTo(Date value) {
            addCriterion("promotion_end_time =", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotEqualTo(Date value) {
            addCriterion("promotion_end_time <>", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeGreaterThan(Date value) {
            addCriterion("promotion_end_time >", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promotion_end_time >=", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeLessThan(Date value) {
            addCriterion("promotion_end_time <", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("promotion_end_time <=", value, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeIn(List<Date> values) {
            addCriterion("promotion_end_time in", values, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotIn(List<Date> values) {
            addCriterion("promotion_end_time not in", values, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeBetween(Date value1, Date value2) {
            addCriterion("promotion_end_time between", value1, value2, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("promotion_end_time not between", value1, value2, "promotionEndTime");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitIsNull() {
            addCriterion("promotion_per_limit is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitIsNotNull() {
            addCriterion("promotion_per_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitEqualTo(Integer value) {
            addCriterion("promotion_per_limit =", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitNotEqualTo(Integer value) {
            addCriterion("promotion_per_limit <>", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitGreaterThan(Integer value) {
            addCriterion("promotion_per_limit >", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_per_limit >=", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitLessThan(Integer value) {
            addCriterion("promotion_per_limit <", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_per_limit <=", value, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitIn(List<Integer> values) {
            addCriterion("promotion_per_limit in", values, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitNotIn(List<Integer> values) {
            addCriterion("promotion_per_limit not in", values, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitBetween(Integer value1, Integer value2) {
            addCriterion("promotion_per_limit between", value1, value2, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionPerLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_per_limit not between", value1, value2, "promotionPerLimit");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(Integer value) {
            addCriterion("promotion_type =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(Integer value) {
            addCriterion("promotion_type <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(Integer value) {
            addCriterion("promotion_type >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_type >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(Integer value) {
            addCriterion("promotion_type <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_type <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<Integer> values) {
            addCriterion("promotion_type in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<Integer> values) {
            addCriterion("promotion_type not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type not between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIsNull() {
            addCriterion("product_category_name is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIsNotNull() {
            addCriterion("product_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameEqualTo(String value) {
            addCriterion("product_category_name =", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotEqualTo(String value) {
            addCriterion("product_category_name <>", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameGreaterThan(String value) {
            addCriterion("product_category_name >", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_name >=", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLessThan(String value) {
            addCriterion("product_category_name <", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("product_category_name <=", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLike(String value) {
            addCriterion("product_category_name like", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotLike(String value) {
            addCriterion("product_category_name not like", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIn(List<String> values) {
            addCriterion("product_category_name in", values, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotIn(List<String> values) {
            addCriterion("product_category_name not in", values, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameBetween(String value1, String value2) {
            addCriterion("product_category_name between", value1, value2, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotBetween(String value1, String value2) {
            addCriterion("product_category_name not between", value1, value2, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barCode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barCode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barCode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barCode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barCode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barCode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barCode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barCode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barCode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barCode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barCode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barCode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barCode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barCode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNull() {
            addCriterion("characteristic is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNotNull() {
            addCriterion("characteristic is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicEqualTo(String value) {
            addCriterion("characteristic =", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotEqualTo(String value) {
            addCriterion("characteristic <>", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThan(String value) {
            addCriterion("characteristic >", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThanOrEqualTo(String value) {
            addCriterion("characteristic >=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThan(String value) {
            addCriterion("characteristic <", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThanOrEqualTo(String value) {
            addCriterion("characteristic <=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLike(String value) {
            addCriterion("characteristic like", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotLike(String value) {
            addCriterion("characteristic not like", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIn(List<String> values) {
            addCriterion("characteristic in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotIn(List<String> values) {
            addCriterion("characteristic not in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicBetween(String value1, String value2) {
            addCriterion("characteristic between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotBetween(String value1, String value2) {
            addCriterion("characteristic not between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Float value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Float value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Float value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Float value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Float value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Float value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Float> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Float> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Float value1, Float value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Float value1, Float value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeIsNull() {
            addCriterion("commissionType is null");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeIsNotNull() {
            addCriterion("commissionType is not null");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeEqualTo(Integer value) {
            addCriterion("commissionType =", value, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeNotEqualTo(Integer value) {
            addCriterion("commissionType <>", value, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeGreaterThan(Integer value) {
            addCriterion("commissionType >", value, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commissionType >=", value, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeLessThan(Integer value) {
            addCriterion("commissionType <", value, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("commissionType <=", value, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeIn(List<Integer> values) {
            addCriterion("commissionType in", values, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeNotIn(List<Integer> values) {
            addCriterion("commissionType not in", values, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeBetween(Integer value1, Integer value2) {
            addCriterion("commissionType between", value1, value2, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andCommissiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("commissionType not between", value1, value2, "commissiontype");
            return (Criteria) this;
        }

        public Criteria andDateaddIsNull() {
            addCriterion("dateAdd is null");
            return (Criteria) this;
        }

        public Criteria andDateaddIsNotNull() {
            addCriterion("dateAdd is not null");
            return (Criteria) this;
        }

        public Criteria andDateaddEqualTo(Date value) {
            addCriterion("dateAdd =", value, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddNotEqualTo(Date value) {
            addCriterion("dateAdd <>", value, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddGreaterThan(Date value) {
            addCriterion("dateAdd >", value, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddGreaterThanOrEqualTo(Date value) {
            addCriterion("dateAdd >=", value, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddLessThan(Date value) {
            addCriterion("dateAdd <", value, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddLessThanOrEqualTo(Date value) {
            addCriterion("dateAdd <=", value, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddIn(List<Date> values) {
            addCriterion("dateAdd in", values, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddNotIn(List<Date> values) {
            addCriterion("dateAdd not in", values, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddBetween(Date value1, Date value2) {
            addCriterion("dateAdd between", value1, value2, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDateaddNotBetween(Date value1, Date value2) {
            addCriterion("dateAdd not between", value1, value2, "dateadd");
            return (Criteria) this;
        }

        public Criteria andDatestartIsNull() {
            addCriterion("dateStart is null");
            return (Criteria) this;
        }

        public Criteria andDatestartIsNotNull() {
            addCriterion("dateStart is not null");
            return (Criteria) this;
        }

        public Criteria andDatestartEqualTo(Date value) {
            addCriterion("dateStart =", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartNotEqualTo(Date value) {
            addCriterion("dateStart <>", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartGreaterThan(Date value) {
            addCriterion("dateStart >", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartGreaterThanOrEqualTo(Date value) {
            addCriterion("dateStart >=", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartLessThan(Date value) {
            addCriterion("dateStart <", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartLessThanOrEqualTo(Date value) {
            addCriterion("dateStart <=", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartIn(List<Date> values) {
            addCriterion("dateStart in", values, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartNotIn(List<Date> values) {
            addCriterion("dateStart not in", values, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartBetween(Date value1, Date value2) {
            addCriterion("dateStart between", value1, value2, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartNotBetween(Date value1, Date value2) {
            addCriterion("dateStart not between", value1, value2, "datestart");
            return (Criteria) this;
        }

        public Criteria andDateupdateIsNull() {
            addCriterion("dateUpdate is null");
            return (Criteria) this;
        }

        public Criteria andDateupdateIsNotNull() {
            addCriterion("dateUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andDateupdateEqualTo(Date value) {
            addCriterion("dateUpdate =", value, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateNotEqualTo(Date value) {
            addCriterion("dateUpdate <>", value, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateGreaterThan(Date value) {
            addCriterion("dateUpdate >", value, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dateUpdate >=", value, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateLessThan(Date value) {
            addCriterion("dateUpdate <", value, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateLessThanOrEqualTo(Date value) {
            addCriterion("dateUpdate <=", value, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateIn(List<Date> values) {
            addCriterion("dateUpdate in", values, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateNotIn(List<Date> values) {
            addCriterion("dateUpdate not in", values, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateBetween(Date value1, Date value2) {
            addCriterion("dateUpdate between", value1, value2, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andDateupdateNotBetween(Date value1, Date value2) {
            addCriterion("dateUpdate not between", value1, value2, "dateupdate");
            return (Criteria) this;
        }

        public Criteria andGotscoreIsNull() {
            addCriterion("gotScore is null");
            return (Criteria) this;
        }

        public Criteria andGotscoreIsNotNull() {
            addCriterion("gotScore is not null");
            return (Criteria) this;
        }

        public Criteria andGotscoreEqualTo(Integer value) {
            addCriterion("gotScore =", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreNotEqualTo(Integer value) {
            addCriterion("gotScore <>", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreGreaterThan(Integer value) {
            addCriterion("gotScore >", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("gotScore >=", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreLessThan(Integer value) {
            addCriterion("gotScore <", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreLessThanOrEqualTo(Integer value) {
            addCriterion("gotScore <=", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreIn(List<Integer> values) {
            addCriterion("gotScore in", values, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreNotIn(List<Integer> values) {
            addCriterion("gotScore not in", values, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreBetween(Integer value1, Integer value2) {
            addCriterion("gotScore between", value1, value2, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("gotScore not between", value1, value2, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeIsNull() {
            addCriterion("gotScoreType is null");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeIsNotNull() {
            addCriterion("gotScoreType is not null");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeEqualTo(Integer value) {
            addCriterion("gotScoreType =", value, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeNotEqualTo(Integer value) {
            addCriterion("gotScoreType <>", value, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeGreaterThan(Integer value) {
            addCriterion("gotScoreType >", value, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gotScoreType >=", value, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeLessThan(Integer value) {
            addCriterion("gotScoreType <", value, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeLessThanOrEqualTo(Integer value) {
            addCriterion("gotScoreType <=", value, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeIn(List<Integer> values) {
            addCriterion("gotScoreType in", values, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeNotIn(List<Integer> values) {
            addCriterion("gotScoreType not in", values, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeBetween(Integer value1, Integer value2) {
            addCriterion("gotScoreType between", value1, value2, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andGotscoretypeNotBetween(Integer value1, Integer value2) {
            addCriterion("gotScoreType not between", value1, value2, "gotscoretype");
            return (Criteria) this;
        }

        public Criteria andKanjiaIsNull() {
            addCriterion("kanjia is null");
            return (Criteria) this;
        }

        public Criteria andKanjiaIsNotNull() {
            addCriterion("kanjia is not null");
            return (Criteria) this;
        }

        public Criteria andKanjiaEqualTo(Boolean value) {
            addCriterion("kanjia =", value, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaNotEqualTo(Boolean value) {
            addCriterion("kanjia <>", value, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaGreaterThan(Boolean value) {
            addCriterion("kanjia >", value, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("kanjia >=", value, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaLessThan(Boolean value) {
            addCriterion("kanjia <", value, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaLessThanOrEqualTo(Boolean value) {
            addCriterion("kanjia <=", value, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaIn(List<Boolean> values) {
            addCriterion("kanjia in", values, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaNotIn(List<Boolean> values) {
            addCriterion("kanjia not in", values, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaBetween(Boolean value1, Boolean value2) {
            addCriterion("kanjia between", value1, value2, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("kanjia not between", value1, value2, "kanjia");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceIsNull() {
            addCriterion("kanjiaPrice is null");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceIsNotNull() {
            addCriterion("kanjiaPrice is not null");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceEqualTo(BigDecimal value) {
            addCriterion("kanjiaPrice =", value, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceNotEqualTo(BigDecimal value) {
            addCriterion("kanjiaPrice <>", value, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceGreaterThan(BigDecimal value) {
            addCriterion("kanjiaPrice >", value, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kanjiaPrice >=", value, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceLessThan(BigDecimal value) {
            addCriterion("kanjiaPrice <", value, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kanjiaPrice <=", value, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceIn(List<BigDecimal> values) {
            addCriterion("kanjiaPrice in", values, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceNotIn(List<BigDecimal> values) {
            addCriterion("kanjiaPrice not in", values, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kanjiaPrice between", value1, value2, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andKanjiapriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kanjiaPrice not between", value1, value2, "kanjiaprice");
            return (Criteria) this;
        }

        public Criteria andLimitationIsNull() {
            addCriterion("limitation is null");
            return (Criteria) this;
        }

        public Criteria andLimitationIsNotNull() {
            addCriterion("limitation is not null");
            return (Criteria) this;
        }

        public Criteria andLimitationEqualTo(Boolean value) {
            addCriterion("limitation =", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationNotEqualTo(Boolean value) {
            addCriterion("limitation <>", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationGreaterThan(Boolean value) {
            addCriterion("limitation >", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("limitation >=", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationLessThan(Boolean value) {
            addCriterion("limitation <", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationLessThanOrEqualTo(Boolean value) {
            addCriterion("limitation <=", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationIn(List<Boolean> values) {
            addCriterion("limitation in", values, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationNotIn(List<Boolean> values) {
            addCriterion("limitation not in", values, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationBetween(Boolean value1, Boolean value2) {
            addCriterion("limitation between", value1, value2, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("limitation not between", value1, value2, "limitation");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIsNull() {
            addCriterion("logisticsId is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIsNotNull() {
            addCriterion("logisticsId is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsidEqualTo(Integer value) {
            addCriterion("logisticsId =", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotEqualTo(Integer value) {
            addCriterion("logisticsId <>", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidGreaterThan(Integer value) {
            addCriterion("logisticsId >", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticsId >=", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLessThan(Integer value) {
            addCriterion("logisticsId <", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLessThanOrEqualTo(Integer value) {
            addCriterion("logisticsId <=", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIn(List<Integer> values) {
            addCriterion("logisticsId in", values, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotIn(List<Integer> values) {
            addCriterion("logisticsId not in", values, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidBetween(Integer value1, Integer value2) {
            addCriterion("logisticsId between", value1, value2, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticsId not between", value1, value2, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andMiaoshaIsNull() {
            addCriterion("miaosha is null");
            return (Criteria) this;
        }

        public Criteria andMiaoshaIsNotNull() {
            addCriterion("miaosha is not null");
            return (Criteria) this;
        }

        public Criteria andMiaoshaEqualTo(Boolean value) {
            addCriterion("miaosha =", value, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaNotEqualTo(Boolean value) {
            addCriterion("miaosha <>", value, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaGreaterThan(Boolean value) {
            addCriterion("miaosha >", value, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("miaosha >=", value, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaLessThan(Boolean value) {
            addCriterion("miaosha <", value, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaLessThanOrEqualTo(Boolean value) {
            addCriterion("miaosha <=", value, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaIn(List<Boolean> values) {
            addCriterion("miaosha in", values, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaNotIn(List<Boolean> values) {
            addCriterion("miaosha not in", values, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaBetween(Boolean value1, Boolean value2) {
            addCriterion("miaosha between", value1, value2, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMiaoshaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("miaosha not between", value1, value2, "miaosha");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNull() {
            addCriterion("minPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNotNull() {
            addCriterion("minPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinpriceEqualTo(BigDecimal value) {
            addCriterion("minPrice =", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotEqualTo(BigDecimal value) {
            addCriterion("minPrice <>", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThan(BigDecimal value) {
            addCriterion("minPrice >", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minPrice >=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThan(BigDecimal value) {
            addCriterion("minPrice <", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minPrice <=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIn(List<BigDecimal> values) {
            addCriterion("minPrice in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotIn(List<BigDecimal> values) {
            addCriterion("minPrice not in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minPrice between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minPrice not between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andNumberfavIsNull() {
            addCriterion("numberFav is null");
            return (Criteria) this;
        }

        public Criteria andNumberfavIsNotNull() {
            addCriterion("numberFav is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfavEqualTo(Integer value) {
            addCriterion("numberFav =", value, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavNotEqualTo(Integer value) {
            addCriterion("numberFav <>", value, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavGreaterThan(Integer value) {
            addCriterion("numberFav >", value, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberFav >=", value, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavLessThan(Integer value) {
            addCriterion("numberFav <", value, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavLessThanOrEqualTo(Integer value) {
            addCriterion("numberFav <=", value, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavIn(List<Integer> values) {
            addCriterion("numberFav in", values, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavNotIn(List<Integer> values) {
            addCriterion("numberFav not in", values, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavBetween(Integer value1, Integer value2) {
            addCriterion("numberFav between", value1, value2, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumberfavNotBetween(Integer value1, Integer value2) {
            addCriterion("numberFav not between", value1, value2, "numberfav");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationIsNull() {
            addCriterion("numberGoodReputation is null");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationIsNotNull() {
            addCriterion("numberGoodReputation is not null");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationEqualTo(Integer value) {
            addCriterion("numberGoodReputation =", value, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationNotEqualTo(Integer value) {
            addCriterion("numberGoodReputation <>", value, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationGreaterThan(Integer value) {
            addCriterion("numberGoodReputation >", value, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberGoodReputation >=", value, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationLessThan(Integer value) {
            addCriterion("numberGoodReputation <", value, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationLessThanOrEqualTo(Integer value) {
            addCriterion("numberGoodReputation <=", value, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationIn(List<Integer> values) {
            addCriterion("numberGoodReputation in", values, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationNotIn(List<Integer> values) {
            addCriterion("numberGoodReputation not in", values, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationBetween(Integer value1, Integer value2) {
            addCriterion("numberGoodReputation between", value1, value2, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumbergoodreputationNotBetween(Integer value1, Integer value2) {
            addCriterion("numberGoodReputation not between", value1, value2, "numbergoodreputation");
            return (Criteria) this;
        }

        public Criteria andNumberordersIsNull() {
            addCriterion("numberOrders is null");
            return (Criteria) this;
        }

        public Criteria andNumberordersIsNotNull() {
            addCriterion("numberOrders is not null");
            return (Criteria) this;
        }

        public Criteria andNumberordersEqualTo(Integer value) {
            addCriterion("numberOrders =", value, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersNotEqualTo(Integer value) {
            addCriterion("numberOrders <>", value, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersGreaterThan(Integer value) {
            addCriterion("numberOrders >", value, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOrders >=", value, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersLessThan(Integer value) {
            addCriterion("numberOrders <", value, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersLessThanOrEqualTo(Integer value) {
            addCriterion("numberOrders <=", value, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersIn(List<Integer> values) {
            addCriterion("numberOrders in", values, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersNotIn(List<Integer> values) {
            addCriterion("numberOrders not in", values, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersBetween(Integer value1, Integer value2) {
            addCriterion("numberOrders between", value1, value2, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumberordersNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOrders not between", value1, value2, "numberorders");
            return (Criteria) this;
        }

        public Criteria andNumbersellsIsNull() {
            addCriterion("numberSells is null");
            return (Criteria) this;
        }

        public Criteria andNumbersellsIsNotNull() {
            addCriterion("numberSells is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersellsEqualTo(Integer value) {
            addCriterion("numberSells =", value, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsNotEqualTo(Integer value) {
            addCriterion("numberSells <>", value, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsGreaterThan(Integer value) {
            addCriterion("numberSells >", value, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberSells >=", value, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsLessThan(Integer value) {
            addCriterion("numberSells <", value, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsLessThanOrEqualTo(Integer value) {
            addCriterion("numberSells <=", value, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsIn(List<Integer> values) {
            addCriterion("numberSells in", values, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsNotIn(List<Integer> values) {
            addCriterion("numberSells not in", values, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsBetween(Integer value1, Integer value2) {
            addCriterion("numberSells between", value1, value2, "numbersells");
            return (Criteria) this;
        }

        public Criteria andNumbersellsNotBetween(Integer value1, Integer value2) {
            addCriterion("numberSells not between", value1, value2, "numbersells");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNull() {
            addCriterion("originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNotNull() {
            addCriterion("originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceEqualTo(BigDecimal value) {
            addCriterion("originalPrice =", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("originalPrice <>", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("originalPrice >", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("originalPrice >=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThan(BigDecimal value) {
            addCriterion("originalPrice <", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("originalPrice <=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIn(List<BigDecimal> values) {
            addCriterion("originalPrice in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("originalPrice not in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("originalPrice between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("originalPrice not between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNull() {
            addCriterion("paixu is null");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNotNull() {
            addCriterion("paixu is not null");
            return (Criteria) this;
        }

        public Criteria andPaixuEqualTo(Integer value) {
            addCriterion("paixu =", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotEqualTo(Integer value) {
            addCriterion("paixu <>", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThan(Integer value) {
            addCriterion("paixu >", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThanOrEqualTo(Integer value) {
            addCriterion("paixu >=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThan(Integer value) {
            addCriterion("paixu <", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThanOrEqualTo(Integer value) {
            addCriterion("paixu <=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuIn(List<Integer> values) {
            addCriterion("paixu in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotIn(List<Integer> values) {
            addCriterion("paixu not in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuBetween(Integer value1, Integer value2) {
            addCriterion("paixu between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotBetween(Integer value1, Integer value2) {
            addCriterion("paixu not between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andPingtuanIsNull() {
            addCriterion("pingtuan is null");
            return (Criteria) this;
        }

        public Criteria andPingtuanIsNotNull() {
            addCriterion("pingtuan is not null");
            return (Criteria) this;
        }

        public Criteria andPingtuanEqualTo(Boolean value) {
            addCriterion("pingtuan =", value, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanNotEqualTo(Boolean value) {
            addCriterion("pingtuan <>", value, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanGreaterThan(Boolean value) {
            addCriterion("pingtuan >", value, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pingtuan >=", value, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanLessThan(Boolean value) {
            addCriterion("pingtuan <", value, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanLessThanOrEqualTo(Boolean value) {
            addCriterion("pingtuan <=", value, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanIn(List<Boolean> values) {
            addCriterion("pingtuan in", values, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanNotIn(List<Boolean> values) {
            addCriterion("pingtuan not in", values, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanBetween(Boolean value1, Boolean value2) {
            addCriterion("pingtuan between", value1, value2, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pingtuan not between", value1, value2, "pingtuan");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceIsNull() {
            addCriterion("pingtuanPrice is null");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceIsNotNull() {
            addCriterion("pingtuanPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceEqualTo(BigDecimal value) {
            addCriterion("pingtuanPrice =", value, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceNotEqualTo(BigDecimal value) {
            addCriterion("pingtuanPrice <>", value, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceGreaterThan(BigDecimal value) {
            addCriterion("pingtuanPrice >", value, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pingtuanPrice >=", value, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceLessThan(BigDecimal value) {
            addCriterion("pingtuanPrice <", value, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pingtuanPrice <=", value, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceIn(List<BigDecimal> values) {
            addCriterion("pingtuanPrice in", values, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceNotIn(List<BigDecimal> values) {
            addCriterion("pingtuanPrice not in", values, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pingtuanPrice between", value1, value2, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andPingtuanpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pingtuanPrice not between", value1, value2, "pingtuanprice");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusIsNull() {
            addCriterion("recommendStatus is null");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusIsNotNull() {
            addCriterion("recommendStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusEqualTo(Integer value) {
            addCriterion("recommendStatus =", value, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusNotEqualTo(Integer value) {
            addCriterion("recommendStatus <>", value, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusGreaterThan(Integer value) {
            addCriterion("recommendStatus >", value, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendStatus >=", value, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusLessThan(Integer value) {
            addCriterion("recommendStatus <", value, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusLessThanOrEqualTo(Integer value) {
            addCriterion("recommendStatus <=", value, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusIn(List<Integer> values) {
            addCriterion("recommendStatus in", values, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusNotIn(List<Integer> values) {
            addCriterion("recommendStatus not in", values, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusBetween(Integer value1, Integer value2) {
            addCriterion("recommendStatus between", value1, value2, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendStatus not between", value1, value2, "recommendstatus");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrIsNull() {
            addCriterion("recommendStatusStr is null");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrIsNotNull() {
            addCriterion("recommendStatusStr is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrEqualTo(String value) {
            addCriterion("recommendStatusStr =", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrNotEqualTo(String value) {
            addCriterion("recommendStatusStr <>", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrGreaterThan(String value) {
            addCriterion("recommendStatusStr >", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrGreaterThanOrEqualTo(String value) {
            addCriterion("recommendStatusStr >=", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrLessThan(String value) {
            addCriterion("recommendStatusStr <", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrLessThanOrEqualTo(String value) {
            addCriterion("recommendStatusStr <=", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrLike(String value) {
            addCriterion("recommendStatusStr like", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrNotLike(String value) {
            addCriterion("recommendStatusStr not like", value, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrIn(List<String> values) {
            addCriterion("recommendStatusStr in", values, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrNotIn(List<String> values) {
            addCriterion("recommendStatusStr not in", values, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrBetween(String value1, String value2) {
            addCriterion("recommendStatusStr between", value1, value2, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andRecommendstatusstrNotBetween(String value1, String value2) {
            addCriterion("recommendStatusStr not between", value1, value2, "recommendstatusstr");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusstrIsNull() {
            addCriterion("statusStr is null");
            return (Criteria) this;
        }

        public Criteria andStatusstrIsNotNull() {
            addCriterion("statusStr is not null");
            return (Criteria) this;
        }

        public Criteria andStatusstrEqualTo(String value) {
            addCriterion("statusStr =", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrNotEqualTo(String value) {
            addCriterion("statusStr <>", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrGreaterThan(String value) {
            addCriterion("statusStr >", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrGreaterThanOrEqualTo(String value) {
            addCriterion("statusStr >=", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrLessThan(String value) {
            addCriterion("statusStr <", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrLessThanOrEqualTo(String value) {
            addCriterion("statusStr <=", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrLike(String value) {
            addCriterion("statusStr like", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrNotLike(String value) {
            addCriterion("statusStr not like", value, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrIn(List<String> values) {
            addCriterion("statusStr in", values, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrNotIn(List<String> values) {
            addCriterion("statusStr not in", values, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrBetween(String value1, String value2) {
            addCriterion("statusStr between", value1, value2, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStatusstrNotBetween(String value1, String value2) {
            addCriterion("statusStr not between", value1, value2, "statusstr");
            return (Criteria) this;
        }

        public Criteria andStoresIsNull() {
            addCriterion("stores is null");
            return (Criteria) this;
        }

        public Criteria andStoresIsNotNull() {
            addCriterion("stores is not null");
            return (Criteria) this;
        }

        public Criteria andStoresEqualTo(Integer value) {
            addCriterion("stores =", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresNotEqualTo(Integer value) {
            addCriterion("stores <>", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresGreaterThan(Integer value) {
            addCriterion("stores >", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("stores >=", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresLessThan(Integer value) {
            addCriterion("stores <", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresLessThanOrEqualTo(Integer value) {
            addCriterion("stores <=", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresIn(List<Integer> values) {
            addCriterion("stores in", values, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresNotIn(List<Integer> values) {
            addCriterion("stores not in", values, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresBetween(Integer value1, Integer value2) {
            addCriterion("stores between", value1, value2, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresNotBetween(Integer value1, Integer value2) {
            addCriterion("stores not between", value1, value2, "stores");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andVetstatusIsNull() {
            addCriterion("vetStatus is null");
            return (Criteria) this;
        }

        public Criteria andVetstatusIsNotNull() {
            addCriterion("vetStatus is not null");
            return (Criteria) this;
        }

        public Criteria andVetstatusEqualTo(Integer value) {
            addCriterion("vetStatus =", value, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusNotEqualTo(Integer value) {
            addCriterion("vetStatus <>", value, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusGreaterThan(Integer value) {
            addCriterion("vetStatus >", value, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("vetStatus >=", value, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusLessThan(Integer value) {
            addCriterion("vetStatus <", value, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusLessThanOrEqualTo(Integer value) {
            addCriterion("vetStatus <=", value, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusIn(List<Integer> values) {
            addCriterion("vetStatus in", values, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusNotIn(List<Integer> values) {
            addCriterion("vetStatus not in", values, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusBetween(Integer value1, Integer value2) {
            addCriterion("vetStatus between", value1, value2, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVetstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("vetStatus not between", value1, value2, "vetstatus");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNull() {
            addCriterion("videoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(String value) {
            addCriterion("videoId =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(String value) {
            addCriterion("videoId <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(String value) {
            addCriterion("videoId >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(String value) {
            addCriterion("videoId >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(String value) {
            addCriterion("videoId <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(String value) {
            addCriterion("videoId <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLike(String value) {
            addCriterion("videoId like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotLike(String value) {
            addCriterion("videoId not like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<String> values) {
            addCriterion("videoId in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<String> values) {
            addCriterion("videoId not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(String value1, String value2) {
            addCriterion("videoId between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(String value1, String value2) {
            addCriterion("videoId not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}