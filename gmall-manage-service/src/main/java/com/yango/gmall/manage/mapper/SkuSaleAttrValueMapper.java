package com.yango.gmall.manage.mapper;

import com.yango.gmall.bean.SkuSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-10-21:05
 */
public interface SkuSaleAttrValueMapper extends Mapper<SkuSaleAttrValue> {

    //  根据spuId 查询数据
    List<SkuSaleAttrValue> selectSkuSaleAttrValueListBySpu(String spuId);
}
