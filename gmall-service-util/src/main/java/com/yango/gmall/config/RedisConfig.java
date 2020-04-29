package com.yango.gmall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈尊清
 * @create 2020-04-12-14:25
 */
@Configuration
public class RedisConfig {

    @Value("${spring.redis.host:disable}")
    private String host;

    @Value("${spring.redis.port:0}")
    private int port;

    @Value("${spring.redis.database:0}")
    private int database;

    @Bean
    public RedisUtil getRedisUtil(){
        if("disable".equals(host)){
            return null;
        }
        RedisUtil redisUtil = new RedisUtil();
        // 调用initJedisPool方法将值传入
        redisUtil.initJedisPool(host,port,database);

        return redisUtil;
    }
}
