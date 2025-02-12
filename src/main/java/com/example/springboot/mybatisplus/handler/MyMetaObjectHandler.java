package com.example.springboot.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2025/2/10 19:14
 */
@Slf4j
@Component
public class MyMetaObjectHandler  implements MetaObjectHandler {
    /** 新增数据填充 */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill....");
        this.setFieldValByName("version", 1, metaObject);
        this.setFieldValByName("createTime",new Date(),metaObject);
    }

  /** 更新数据填充 */
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill....");
      //  this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
