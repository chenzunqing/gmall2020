package com.yango.gmall.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 陈尊清
 * @create 2020-04-18-19:18
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequire {
    // true ：则表示需要登录，否则不需要登录！
    boolean autoRedirect() default true;
}
