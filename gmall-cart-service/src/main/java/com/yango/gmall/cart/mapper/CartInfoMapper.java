package com.yango.gmall.cart.mapper;

import com.yango.gmall.bean.CartInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-19-17:01
 */
public interface CartInfoMapper extends Mapper<CartInfo> {
    List<CartInfo> selectCartListWithCurPrice(String userId);
}
