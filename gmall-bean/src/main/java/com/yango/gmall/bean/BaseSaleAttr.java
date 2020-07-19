package com.yango.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author 陈尊清
 * @create 2020-04-10-1:46
 */
@Data
public class BaseSaleAttr implements Serializable {

    @Id
    @Column
    String id ;

    @Column
    String name;

}
