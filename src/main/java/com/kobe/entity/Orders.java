package com.kobe.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orders implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer orderId;

    /**
     * 
     */
    private Date submitTime;

    /**
     * 
     */
    private Date payTime;

    /**
     * 
     */
    private Date outStackTime;

    /**
     * 
     */
    private BigDecimal shouldPay;

    /**
     * 
     */
    private BigDecimal comission;

    /**
     * 
     */
    private String comissionPin;

    /**
     * 
     */
    private String pin;

    /**
     * 
     */
    private Integer skuCount;

    /**
     * 
     */
    private Byte orderType;

    /**
     * 
     */
    private Byte orderStatus;

    /**
     * orders
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return order_id 
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId 
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * @return submit_time 
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 
     * @param submitTime 
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 
     * @return pay_time 
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 
     * @param payTime 
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 
     * @return out_stack_time 
     */
    public Date getOutStackTime() {
        return outStackTime;
    }

    /**
     * 
     * @param outStackTime 
     */
    public void setOutStackTime(Date outStackTime) {
        this.outStackTime = outStackTime;
    }

    /**
     * 
     * @return should_pay 
     */
    public BigDecimal getShouldPay() {
        return shouldPay;
    }

    /**
     * 
     * @param shouldPay 
     */
    public void setShouldPay(BigDecimal shouldPay) {
        this.shouldPay = shouldPay;
    }

    /**
     * 
     * @return comission 
     */
    public BigDecimal getComission() {
        return comission;
    }

    /**
     * 
     * @param comission 
     */
    public void setComission(BigDecimal comission) {
        this.comission = comission;
    }

    /**
     * 
     * @return comission_pin 
     */
    public String getComissionPin() {
        return comissionPin;
    }

    /**
     * 
     * @param comissionPin 
     */
    public void setComissionPin(String comissionPin) {
        this.comissionPin = comissionPin == null ? null : comissionPin.trim();
    }

    /**
     * 
     * @return pin 
     */
    public String getPin() {
        return pin;
    }

    /**
     * 
     * @param pin 
     */
    public void setPin(String pin) {
        this.pin = pin == null ? null : pin.trim();
    }

    /**
     * 
     * @return sku_count 
     */
    public Integer getSkuCount() {
        return skuCount;
    }

    /**
     * 
     * @param skuCount 
     */
    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    /**
     * 
     * @return order_type 
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * 
     * @param orderType 
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * 
     * @return order_status 
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 
     * @param orderStatus 
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }
}