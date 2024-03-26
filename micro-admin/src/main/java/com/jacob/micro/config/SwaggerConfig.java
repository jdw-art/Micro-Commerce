package com.jacob.micro.config;

import com.jacob.micro.domain.SwaggerProperties;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: Jacob
 * @Description: Swagger API文档相关配置
 * @Date: 2024/3/26 22:17
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig{
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.jacob.micro.controller")
                .title("micro后台系统")
                .description("micro后台相关接口文档")
                .contactName("jacob")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }
}
