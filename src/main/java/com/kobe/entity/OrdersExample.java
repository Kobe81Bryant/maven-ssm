package com.kobe.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    /**
     * orders
     */
    protected String orderByClause;

    /**
     * orders
     */
    protected boolean distinct;

    /**
     * orders
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-12-09
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
     * @mbggenerated 2018-12-09
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-12-09
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * orders 2018-12-09
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeIsNull() {
            addCriterion("out_stack_time is null");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeIsNotNull() {
            addCriterion("out_stack_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeEqualTo(Date value) {
            addCriterion("out_stack_time =", value, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeNotEqualTo(Date value) {
            addCriterion("out_stack_time <>", value, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeGreaterThan(Date value) {
            addCriterion("out_stack_time >", value, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("out_stack_time >=", value, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeLessThan(Date value) {
            addCriterion("out_stack_time <", value, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeLessThanOrEqualTo(Date value) {
            addCriterion("out_stack_time <=", value, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeIn(List<Date> values) {
            addCriterion("out_stack_time in", values, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeNotIn(List<Date> values) {
            addCriterion("out_stack_time not in", values, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeBetween(Date value1, Date value2) {
            addCriterion("out_stack_time between", value1, value2, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andOutStackTimeNotBetween(Date value1, Date value2) {
            addCriterion("out_stack_time not between", value1, value2, "outStackTime");
            return (Criteria) this;
        }

        public Criteria andShouldPayIsNull() {
            addCriterion("should_pay is null");
            return (Criteria) this;
        }

        public Criteria andShouldPayIsNotNull() {
            addCriterion("should_pay is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPayEqualTo(BigDecimal value) {
            addCriterion("should_pay =", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayNotEqualTo(BigDecimal value) {
            addCriterion("should_pay <>", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayGreaterThan(BigDecimal value) {
            addCriterion("should_pay >", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("should_pay >=", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayLessThan(BigDecimal value) {
            addCriterion("should_pay <", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("should_pay <=", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayIn(List<BigDecimal> values) {
            addCriterion("should_pay in", values, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayNotIn(List<BigDecimal> values) {
            addCriterion("should_pay not in", values, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_pay between", value1, value2, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_pay not between", value1, value2, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andComissionIsNull() {
            addCriterion("comission is null");
            return (Criteria) this;
        }

        public Criteria andComissionIsNotNull() {
            addCriterion("comission is not null");
            return (Criteria) this;
        }

        public Criteria andComissionEqualTo(BigDecimal value) {
            addCriterion("comission =", value, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionNotEqualTo(BigDecimal value) {
            addCriterion("comission <>", value, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionGreaterThan(BigDecimal value) {
            addCriterion("comission >", value, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("comission >=", value, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionLessThan(BigDecimal value) {
            addCriterion("comission <", value, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("comission <=", value, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionIn(List<BigDecimal> values) {
            addCriterion("comission in", values, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionNotIn(List<BigDecimal> values) {
            addCriterion("comission not in", values, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comission between", value1, value2, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comission not between", value1, value2, "comission");
            return (Criteria) this;
        }

        public Criteria andComissionPinIsNull() {
            addCriterion("comission_pin is null");
            return (Criteria) this;
        }

        public Criteria andComissionPinIsNotNull() {
            addCriterion("comission_pin is not null");
            return (Criteria) this;
        }

        public Criteria andComissionPinEqualTo(String value) {
            addCriterion("comission_pin =", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinNotEqualTo(String value) {
            addCriterion("comission_pin <>", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinGreaterThan(String value) {
            addCriterion("comission_pin >", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinGreaterThanOrEqualTo(String value) {
            addCriterion("comission_pin >=", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinLessThan(String value) {
            addCriterion("comission_pin <", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinLessThanOrEqualTo(String value) {
            addCriterion("comission_pin <=", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinLike(String value) {
            addCriterion("comission_pin like", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinNotLike(String value) {
            addCriterion("comission_pin not like", value, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinIn(List<String> values) {
            addCriterion("comission_pin in", values, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinNotIn(List<String> values) {
            addCriterion("comission_pin not in", values, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinBetween(String value1, String value2) {
            addCriterion("comission_pin between", value1, value2, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andComissionPinNotBetween(String value1, String value2) {
            addCriterion("comission_pin not between", value1, value2, "comissionPin");
            return (Criteria) this;
        }

        public Criteria andPinIsNull() {
            addCriterion("pin is null");
            return (Criteria) this;
        }

        public Criteria andPinIsNotNull() {
            addCriterion("pin is not null");
            return (Criteria) this;
        }

        public Criteria andPinEqualTo(String value) {
            addCriterion("pin =", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotEqualTo(String value) {
            addCriterion("pin <>", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinGreaterThan(String value) {
            addCriterion("pin >", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinGreaterThanOrEqualTo(String value) {
            addCriterion("pin >=", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLessThan(String value) {
            addCriterion("pin <", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLessThanOrEqualTo(String value) {
            addCriterion("pin <=", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLike(String value) {
            addCriterion("pin like", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotLike(String value) {
            addCriterion("pin not like", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinIn(List<String> values) {
            addCriterion("pin in", values, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotIn(List<String> values) {
            addCriterion("pin not in", values, "pin");
            return (Criteria) this;
        }

        public Criteria andPinBetween(String value1, String value2) {
            addCriterion("pin between", value1, value2, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotBetween(String value1, String value2) {
            addCriterion("pin not between", value1, value2, "pin");
            return (Criteria) this;
        }

        public Criteria andSkuCountIsNull() {
            addCriterion("sku_count is null");
            return (Criteria) this;
        }

        public Criteria andSkuCountIsNotNull() {
            addCriterion("sku_count is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCountEqualTo(Integer value) {
            addCriterion("sku_count =", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountNotEqualTo(Integer value) {
            addCriterion("sku_count <>", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountGreaterThan(Integer value) {
            addCriterion("sku_count >", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_count >=", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountLessThan(Integer value) {
            addCriterion("sku_count <", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountLessThanOrEqualTo(Integer value) {
            addCriterion("sku_count <=", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountIn(List<Integer> values) {
            addCriterion("sku_count in", values, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountNotIn(List<Integer> values) {
            addCriterion("sku_count not in", values, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountBetween(Integer value1, Integer value2) {
            addCriterion("sku_count between", value1, value2, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_count not between", value1, value2, "skuCount");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }
    }

    /**
     * orders
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * orders 2018-12-09
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