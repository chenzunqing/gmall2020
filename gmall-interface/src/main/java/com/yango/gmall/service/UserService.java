package com.yango.gmall.service;

import com.yango.gmall.bean.UserAddress;
import com.yango.gmall.bean.UserInfo;

import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-07-17:39
 */
public interface UserService {

    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据userId 查询用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

    /**
     * 创建登录
     * @param userInfo
     * @return
     */
    UserInfo login(UserInfo userInfo);

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    UserInfo verify(String userId);
}
