package com.yango.gmall.service;

import com.yango.gmall.bean.SkuLsInfo;
import com.yango.gmall.bean.SkuLsParams;
import com.yango.gmall.bean.SkuLsResult;

/**
 * @author 陈尊清
 * @create 2020-04-13-17:16
 */
public interface ListService {

    /**
     * 保存数据到es 中！
     * @param skuLsInfo
     */
    void saveSkuLsInfo(SkuLsInfo skuLsInfo);

    /**
     * 检索数据
     * @param skuLsParams
     * @return
     */
    SkuLsResult search(SkuLsParams skuLsParams);

    /**
     * 记录每个商品被访问的次数
     * @param skuId
     */
    void incrHotScore(String skuId);
}
