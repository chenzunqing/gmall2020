package com.yango.gmall.user.controller;

import com.yango.gmall.bean.UserInfo;
import com.yango.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 陈尊清
 * @create 2020-04-07-18:04
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
       return userService.findAll();
    }

}
