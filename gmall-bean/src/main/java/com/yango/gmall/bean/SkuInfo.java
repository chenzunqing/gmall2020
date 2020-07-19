package com.yango.gmall.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-10-21:02
 */
@Data
public class SkuInfo implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    String id;

    @Column
    String spuId;

    @Column
    BigDecimal price;

    @Column
    String skuName;

    @Column
    BigDecimal weight;

    @Column
    String skuDesc;

    @Column
    String catalog3Id;

    @Column
    String skuDefaultImg;

    @Transient
    List<SkuImage> skuImageList;

    @Transient
    List<SkuAttrValue> skuAttrValueList;

    @Transient
    List<SkuSaleAttrValue> skuSaleAttrValueList;

}