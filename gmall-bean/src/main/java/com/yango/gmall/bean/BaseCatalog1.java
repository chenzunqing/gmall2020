package com.yango.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author 陈尊清
 * @create 2020-04-08-19:09
 */
@Data
public class BaseCatalog1 implements Serializable{

    @Id
    @Column
    private String id;
    @Column
    private String name;
}
