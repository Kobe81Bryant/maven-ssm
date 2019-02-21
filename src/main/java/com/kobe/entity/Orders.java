package com.kobe.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by liujianshuo on 2017/5/10.
 */
@Data
public class Orders {
    private Long orderId;
    private Long parentOrderId;
    private String pin;
    private Integer orderSkuCount;
    private BigDecimal orderShouldPay;
    private BigDecimal orderFee;
    private BigDecimal orderEcard;
    private Integer orderType;
    private Integer recycleFlag;
    private Integer cancelFlag;
    private Integer cancelReasonType;
    private Integer cancelResult;
    private String cancelReason;
    private Integer deleteFlag;
    private Integer confirmFlag;
    private Integer paymentType;
    private Date payDatetime;
    private Date outStockDatetime;
    private Integer shipmentType;
    private String orderDetail;
    private Integer orderStateCenter;
    private Integer orderStateToplife;
    //private String autoCancelTime;
    //下单时间
    private Date submitDatetime;


    private Date syncDatetime1;
    private Date syncDatetime2;

    private String orderUuid;

    private BigDecimal orderCoupon;
    private BigDecimal partMoney;

    private Integer source; //来源,目前为 1:pc, 2:app, 3:m, 默认值为0
    private Integer client; //客户端,目前为 1:ios, 2:android, 3:ipad, 默认值为0

    private Integer orderTypeToplife;//toplife订单类型，1表示一般订单   2表示预定的订单
    private Integer orderTypeJingTiao; //京挑订单类型，1表示普通订单，2表示礼包订单
    private BigDecimal commission; //订单产生的佣金
    private String commissionPin; //记佣人pin
    private Integer balanceState; //记佣状态 记佣状态，默认0未推送，1已推送，2已结算
    private Long originalOrderId; //原始单号，逆向订单独有
    private String taskId; //计提任务批次id
    private String businessId; //计提业务id

    private Long id;

    private Short yn;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modified;
}
