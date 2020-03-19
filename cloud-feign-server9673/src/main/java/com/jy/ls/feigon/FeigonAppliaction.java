package com.jy.ls.feigon;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LENOVO
 * @date 2020/3/17 20:48
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableFeignClients //当使用的feignClents 来自引用别的工程时,需要指定包名,如果不指定就算使用ComponentScan 扫描也不行
public class FeigonAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(FeigonAppliaction.class,args);
    }
}
