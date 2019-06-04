package com.kobe.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkuNoticeExample {
    /**
     * sku_notice
     */
    protected String orderByClause;

    /**
     * sku_notice
     */
    protected boolean distinct;

    /**
     * sku_notice
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public SkuNoticeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * sku_notice 2019-04-02
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andOrdIsNull() {
            addCriterion("ord is null");
            return (Criteria) this;
        }

        public Criteria andOrdIsNotNull() {
            addCriterion("ord is not null");
            return (Criteria) this;
        }

        public Criteria andOrdEqualTo(Integer value) {
            addCriterion("ord =", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotEqualTo(Integer value) {
            addCriterion("ord <>", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThan(Integer value) {
            addCriterion("ord >", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord >=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThan(Integer value) {
            addCriterion("ord <", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThanOrEqualTo(Integer value) {
            addCriterion("ord <=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdIn(List<Integer> values) {
            addCriterion("ord in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotIn(List<Integer> values) {
            addCriterion("ord not in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdBetween(Integer value1, Integer value2) {
            addCriterion("ord between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotBetween(Integer value1, Integer value2) {
            addCriterion("ord not between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("yn is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("yn is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(Byte value) {
            addCriterion("yn =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(Byte value) {
            addCriterion("yn <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(Byte value) {
            addCriterion("yn >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Byte value) {
            addCriterion("yn >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(Byte value) {
            addCriterion("yn <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(Byte value) {
            addCriterion("yn <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<Byte> values) {
            addCriterion("yn in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<Byte> values) {
            addCriterion("yn not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(Byte value1, Byte value2) {
            addCriterion("yn between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(Byte value1, Byte value2) {
            addCriterion("yn not between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andMarkPriceIsNull() {
            addCriterion("mark_price is null");
            return (Criteria) this;
        }

        public Criteria andMarkPriceIsNotNull() {
            addCriterion("mark_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarkPriceEqualTo(BigDecimal value) {
            addCriterion("mark_price =", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceNotEqualTo(BigDecimal value) {
            addCriterion("mark_price <>", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceGreaterThan(BigDecimal value) {
            addCriterion("mark_price >", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mark_price >=", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceLessThan(BigDecimal value) {
            addCriterion("mark_price <", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mark_price <=", value, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceIn(List<BigDecimal> values) {
            addCriterion("mark_price in", values, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceNotIn(List<BigDecimal> values) {
            addCriterion("mark_price not in", values, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mark_price between", value1, value2, "markPrice");
            return (Criteria) this;
        }

        public Criteria andMarkPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mark_price not between", value1, value2, "markPrice");
            return (Criteria) this;
        }

        public Criteria andSkuSloganIsNull() {
            addCriterion("sku_slogan is null");
            return (Criteria) this;
        }

        public Criteria andSkuSloganIsNotNull() {
            addCriterion("sku_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSloganEqualTo(String value) {
            addCriterion("sku_slogan =", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganNotEqualTo(String value) {
            addCriterion("sku_slogan <>", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganGreaterThan(String value) {
            addCriterion("sku_slogan >", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganGreaterThanOrEqualTo(String value) {
            addCriterion("sku_slogan >=", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganLessThan(String value) {
            addCriterion("sku_slogan <", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganLessThanOrEqualTo(String value) {
            addCriterion("sku_slogan <=", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganLike(String value) {
            addCriterion("sku_slogan like", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganNotLike(String value) {
            addCriterion("sku_slogan not like", value, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganIn(List<String> values) {
            addCriterion("sku_slogan in", values, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganNotIn(List<String> values) {
            addCriterion("sku_slogan not in", values, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganBetween(String value1, String value2) {
            addCriterion("sku_slogan between", value1, value2, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andSkuSloganNotBetween(String value1, String value2) {
            addCriterion("sku_slogan not between", value1, value2, "skuSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganIsNull() {
            addCriterion("stock_slogan is null");
            return (Criteria) this;
        }

        public Criteria andStockSloganIsNotNull() {
            addCriterion("stock_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andStockSloganEqualTo(String value) {
            addCriterion("stock_slogan =", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganNotEqualTo(String value) {
            addCriterion("stock_slogan <>", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganGreaterThan(String value) {
            addCriterion("stock_slogan >", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganGreaterThanOrEqualTo(String value) {
            addCriterion("stock_slogan >=", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganLessThan(String value) {
            addCriterion("stock_slogan <", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganLessThanOrEqualTo(String value) {
            addCriterion("stock_slogan <=", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganLike(String value) {
            addCriterion("stock_slogan like", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganNotLike(String value) {
            addCriterion("stock_slogan not like", value, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganIn(List<String> values) {
            addCriterion("stock_slogan in", values, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganNotIn(List<String> values) {
            addCriterion("stock_slogan not in", values, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganBetween(String value1, String value2) {
            addCriterion("stock_slogan between", value1, value2, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andStockSloganNotBetween(String value1, String value2) {
            addCriterion("stock_slogan not between", value1, value2, "stockSlogan");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNull() {
            addCriterion("show_time is null");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNotNull() {
            addCriterion("show_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowTimeEqualTo(Date value) {
            addCriterion("show_time =", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotEqualTo(Date value) {
            addCriterion("show_time <>", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThan(Date value) {
            addCriterion("show_time >", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("show_time >=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThan(Date value) {
            addCriterion("show_time <", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThanOrEqualTo(Date value) {
            addCriterion("show_time <=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIn(List<Date> values) {
            addCriterion("show_time in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotIn(List<Date> values) {
            addCriterion("show_time not in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeBetween(Date value1, Date value2) {
            addCriterion("show_time between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotBetween(Date value1, Date value2) {
            addCriterion("show_time not between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeIsNull() {
            addCriterion("sell_time is null");
            return (Criteria) this;
        }

        public Criteria andSellTimeIsNotNull() {
            addCriterion("sell_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellTimeEqualTo(Date value) {
            addCriterion("sell_time =", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotEqualTo(Date value) {
            addCriterion("sell_time <>", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeGreaterThan(Date value) {
            addCriterion("sell_time >", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sell_time >=", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLessThan(Date value) {
            addCriterion("sell_time <", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLessThanOrEqualTo(Date value) {
            addCriterion("sell_time <=", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeIn(List<Date> values) {
            addCriterion("sell_time in", values, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotIn(List<Date> values) {
            addCriterion("sell_time not in", values, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeBetween(Date value1, Date value2) {
            addCriterion("sell_time between", value1, value2, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotBetween(Date value1, Date value2) {
            addCriterion("sell_time not between", value1, value2, "sellTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Integer value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Integer value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Integer value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Integer value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Integer> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Integer> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andCommVipRateIsNull() {
            addCriterion("comm_vip_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommVipRateIsNotNull() {
            addCriterion("comm_vip_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommVipRateEqualTo(Integer value) {
            addCriterion("comm_vip_rate =", value, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateNotEqualTo(Integer value) {
            addCriterion("comm_vip_rate <>", value, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateGreaterThan(Integer value) {
            addCriterion("comm_vip_rate >", value, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_vip_rate >=", value, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateLessThan(Integer value) {
            addCriterion("comm_vip_rate <", value, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateLessThanOrEqualTo(Integer value) {
            addCriterion("comm_vip_rate <=", value, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateIn(List<Integer> values) {
            addCriterion("comm_vip_rate in", values, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateNotIn(List<Integer> values) {
            addCriterion("comm_vip_rate not in", values, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateBetween(Integer value1, Integer value2) {
            addCriterion("comm_vip_rate between", value1, value2, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommVipRateNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_vip_rate not between", value1, value2, "commVipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateIsNull() {
            addCriterion("comm_svip_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateIsNotNull() {
            addCriterion("comm_svip_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateEqualTo(Integer value) {
            addCriterion("comm_svip_rate =", value, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateNotEqualTo(Integer value) {
            addCriterion("comm_svip_rate <>", value, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateGreaterThan(Integer value) {
            addCriterion("comm_svip_rate >", value, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_svip_rate >=", value, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateLessThan(Integer value) {
            addCriterion("comm_svip_rate <", value, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateLessThanOrEqualTo(Integer value) {
            addCriterion("comm_svip_rate <=", value, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateIn(List<Integer> values) {
            addCriterion("comm_svip_rate in", values, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateNotIn(List<Integer> values) {
            addCriterion("comm_svip_rate not in", values, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateBetween(Integer value1, Integer value2) {
            addCriterion("comm_svip_rate between", value1, value2, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommSvipRateNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_svip_rate not between", value1, value2, "commSvipRate");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeIsNull() {
            addCriterion("comm_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeIsNotNull() {
            addCriterion("comm_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeEqualTo(Date value) {
            addCriterion("comm_begin_time =", value, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeNotEqualTo(Date value) {
            addCriterion("comm_begin_time <>", value, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeGreaterThan(Date value) {
            addCriterion("comm_begin_time >", value, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comm_begin_time >=", value, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeLessThan(Date value) {
            addCriterion("comm_begin_time <", value, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("comm_begin_time <=", value, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeIn(List<Date> values) {
            addCriterion("comm_begin_time in", values, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeNotIn(List<Date> values) {
            addCriterion("comm_begin_time not in", values, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeBetween(Date value1, Date value2) {
            addCriterion("comm_begin_time between", value1, value2, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("comm_begin_time not between", value1, value2, "commBeginTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeIsNull() {
            addCriterion("comm_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeIsNotNull() {
            addCriterion("comm_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeEqualTo(Date value) {
            addCriterion("comm_end_time =", value, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeNotEqualTo(Date value) {
            addCriterion("comm_end_time <>", value, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeGreaterThan(Date value) {
            addCriterion("comm_end_time >", value, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comm_end_time >=", value, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeLessThan(Date value) {
            addCriterion("comm_end_time <", value, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("comm_end_time <=", value, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeIn(List<Date> values) {
            addCriterion("comm_end_time in", values, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeNotIn(List<Date> values) {
            addCriterion("comm_end_time not in", values, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeBetween(Date value1, Date value2) {
            addCriterion("comm_end_time between", value1, value2, "commEndTime");
            return (Criteria) this;
        }

        public Criteria andCommEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("comm_end_time not between", value1, value2, "commEndTime");
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

        public Criteria andCouponKeyIsNull() {
            addCriterion("coupon_key is null");
            return (Criteria) this;
        }

        public Criteria andCouponKeyIsNotNull() {
            addCriterion("coupon_key is not null");
            return (Criteria) this;
        }

        public Criteria andCouponKeyEqualTo(String value) {
            addCriterion("coupon_key =", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyNotEqualTo(String value) {
            addCriterion("coupon_key <>", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyGreaterThan(String value) {
            addCriterion("coupon_key >", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_key >=", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyLessThan(String value) {
            addCriterion("coupon_key <", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyLessThanOrEqualTo(String value) {
            addCriterion("coupon_key <=", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyLike(String value) {
            addCriterion("coupon_key like", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyNotLike(String value) {
            addCriterion("coupon_key not like", value, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyIn(List<String> values) {
            addCriterion("coupon_key in", values, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyNotIn(List<String> values) {
            addCriterion("coupon_key not in", values, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyBetween(String value1, String value2) {
            addCriterion("coupon_key between", value1, value2, "couponKey");
            return (Criteria) this;
        }

        public Criteria andCouponKeyNotBetween(String value1, String value2) {
            addCriterion("coupon_key not between", value1, value2, "couponKey");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }
    }

    /**
     * sku_notice
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sku_notice 2019-04-02
     */
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