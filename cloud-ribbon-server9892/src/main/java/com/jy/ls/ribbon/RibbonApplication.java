package com.jy.ls.ribbon;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

/**
 * @author LENOVO
 * @date 2020/3/17 19:36
 */
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }
    @Bean
    @LoadBalanced  // 声明这个是负载均衡
    public RibbonApplication ribbonApplication(){
        return new RibbonApplication();
    }
}
