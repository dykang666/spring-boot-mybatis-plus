package com.example.springboot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2025/2/10 18:00
 */
@Data
@NoArgsConstructor
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField(value = "company_id", property = "company.id")
    private Company company;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @Version
    private Integer version;

}
