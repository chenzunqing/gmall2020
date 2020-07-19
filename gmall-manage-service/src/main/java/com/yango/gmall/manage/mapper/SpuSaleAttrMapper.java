package com.yango.gmall.manage.mapper;

import com.yango.gmall.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-10-2:22
 */
public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr> {

    /**
     * 根据spuId 查询销售属性集合
     * 需要使用SpuSaleAttrMapper.xml 写在resources 目录下
     * @param spuId
     * @return
     */
    List<SpuSaleAttr> selectSpuSaleAttrList(String spuId);

    /**
     *
     * @param id
     * @param spuId
     * @return
     */
    List<SpuSaleAttr> selectSpuSaleAttrListCheckBySku(String id, String spuId);
}
