package com.jy.ls.login.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})//参数级别 用于描述参数
@Retention(RetentionPolicy.RUNTIME) //注解保留到运行阶段
public @interface NoNull {

}
