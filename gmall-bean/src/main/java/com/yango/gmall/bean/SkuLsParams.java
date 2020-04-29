package com.yango.gmall.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 陈尊清
 * @create 2020-04-14-16:00
 */
@Data
public class SkuLsParams implements Serializable {

    // keyword = skuName

    String  keyword;

    String catalog3Id;

    String[] valueId;

    int pageNo=1;

    int pageSize=20;

}