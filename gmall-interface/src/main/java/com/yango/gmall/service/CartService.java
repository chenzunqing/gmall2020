package com.yango.gmall.service;

import com.yango.gmall.bean.CartInfo;
import com.yango.gmall.bean.OrderInfo;

import java.util.List; /**
 * @author 陈尊清
 * @create 2020-04-19-17:00
 */
public interface CartService {

    // 写方法？ skuNum,skuId,userId
    void addToCart(String skuId, String userId, Integer skuNum);

    /**
     * 合并购物车
     * @param cartListCK
     * @param userId
     * @return
     */
    List<CartInfo> mergeToCartList(List<CartInfo> cartListCK, String userId);

    /**
     * 根据用户Id 查询购物车数据！
     * @param userId
     * @return
     */
    List<CartInfo> getCartList(String userId);

    /**
     * 登录状态勾选购物车
     * @param skuId
     * @param isChecked
     * @param userId
     */
    void checkCart(String skuId, String isChecked, String userId);

    /**
     * 根据userId 查询购物车列表
     * @param userId
     * @return
     */
    List<CartInfo> getCartCheckedList(String userId);

    /**
     * 通过userId 查询实时价格
     * @param userId
     * @return
     */
    List<CartInfo> loadCartCache(String userId);
}
