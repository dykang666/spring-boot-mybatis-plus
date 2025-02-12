package com.example.springboot.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.mybatisplus.entity.Company;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2025/2/10 20:25
 */
public interface CompanyMapper  extends BaseMapper<Company> {
    Company testResultMapCollection();
}
