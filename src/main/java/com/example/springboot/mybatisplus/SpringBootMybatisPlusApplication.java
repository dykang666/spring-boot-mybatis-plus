package com.example.springboot.mybatisplus;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** *
 * @author kangdongyang
 * @version 1.0
 * @description:
 * 参考  https://github.com/gusijin/spring-boot-myBatisPlus
 * @date 2025/2/10 17:59
 */
@MapperScan("com.example.springboot.mybatisplus.mapper")
@SpringBootApplication
public class SpringBootMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlusApplication.class, args);
    }

}
