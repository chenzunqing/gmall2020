package com.yango.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-14-16:01
 */
@Data
public class SkuLsResult implements Serializable {

    List<SkuLsInfo> skuLsInfoList;

    long total;

    long totalPages;

    List<String> attrValueIdList;

}