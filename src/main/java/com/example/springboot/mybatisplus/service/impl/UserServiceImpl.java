package com.example.springboot.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.mybatisplus.entity.User;
import com.example.springboot.mybatisplus.mapper.UserMapper;
import com.example.springboot.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2025/2/10 18:05
 */

@Service
public class  UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> selectUserPage(IPage<User> page, QueryWrapper<User> wrapper) {
        return baseMapper.selectUserPage(page, wrapper);
    }
}
