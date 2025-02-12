package com.example.springboot.mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.mybatisplus.entity.User;

import java.util.List;


/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 *  创建service 接口
 * @date 2025/2/10 18:03
 */

public interface  UserService extends IService<User> {
    List<User> selectUserPage(IPage<User> page, QueryWrapper<User> wrapper);
}
