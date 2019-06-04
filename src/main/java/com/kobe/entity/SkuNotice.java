package com.kobe.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class SkuNotice implements Serializable {
    /**
     * 主键
     */
    @Max(6)
    @Min(0)
    @NotNull
    private Integer id;

    /**
     * skuId
     */
    private Long skuId;

    /**
     * 类型. 0:普通sku, 1:礼包
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * sku名称
     */
    @NotNull
    @Length(max = 22,min = 5)
    private String skuName;

    /**
     * sku排序
     */
    private Integer ord;

    /**
     * sku是否有效，0-无效，1-有效
     */
    private Integer yn;

    /**
     * 是否爆品
     */
    private Integer isHot;

    /**
     * 划线价
     */
    private BigDecimal markPrice;

    /**
     * sku营销语
     */
    private String skuSlogan;

    /**
     * 库存营销语
     */
    private String stockSlogan;

    /**
     * 预告显示时间
     */
    private Date showTime;

    /**
     * 开售时间
     */
    private Date sellTime;

    /**
     * 下架时间
     */
    private Date closeTime;

    /**
     * 券类型0没有，1普通券，2新人券，3白金券，4黑金券
     */
    private Integer couponType;

    /**
     * 批次id
     */
    private Integer batchId;

    /**
     * vip佣金比例
     */
    private Integer commVipRate;

    /**
     * svip佣金比例
     */
    private Integer commSvipRate;

    /**
     * 佣金开始时间
     */
    private Date commBeginTime;

    /**
     * 佣金结束时间
     */
    private Date commEndTime;

    /**
     * 0预告未开始，1预告开始，2待下架
     */
    private Integer status;

    /**
     * 优惠券key
     */
    private String couponKey;

    /**
     * 优惠券roleId
     */
    private Integer roleId;

}