package com.example.springboot.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboot.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2025/2/10 18:02
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> selectUserPage(IPage<User> page, @Param("ew") QueryWrapper<User> wrapper);
}
