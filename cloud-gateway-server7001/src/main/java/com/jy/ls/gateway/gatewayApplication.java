package com.jy.ls.gateway;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author LENOVO
 * @date 2020/3/17 1:55
 */
@EnableZuulProxy  //设置该类是网关的启动类
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)  //可以帮住springboot应用将所有符合条件@Configuration 配置加载到当前的springboot装甲并使用的ioc容器中
public class gatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(gatewayApplication.class,args);
    }
}
