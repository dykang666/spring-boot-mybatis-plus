package com.example.springboot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2025/2/10 20:18
 */
@Data
@TableName("company")
public class Company {
    private Long id;
    private String name;
    List<User> userList;
}
