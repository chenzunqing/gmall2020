package com.yango.gmall.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 陈尊清
 * @create 2020-04-18-18:07
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthInterceptor authInterceptor;
    // 拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截器
        registry.addInterceptor(authInterceptor).addPathPatterns("/**");
        // 添加拦截器
        super.addInterceptors(registry);
    }
}
