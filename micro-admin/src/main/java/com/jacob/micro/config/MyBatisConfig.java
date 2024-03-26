package com.jacob.micro.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: Jacob
 * @Description: MyBatis相关配置
 * @Date: 2024/3/26 22:11
 * @Version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.jacob.micro.mapper","com.jacob.micro.dao"})
public class MyBatisConfig {
}
