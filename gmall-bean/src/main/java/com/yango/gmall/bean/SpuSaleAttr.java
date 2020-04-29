package com.yango.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-10-2:18
 */
@Data
public class SpuSaleAttr implements Serializable {

    @Id
    @Column
    String id ;

    @Column
    String spuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrName;

    // 销售属性值集合
    @Transient
    List<SpuSaleAttrValue> spuSaleAttrValueList;

}