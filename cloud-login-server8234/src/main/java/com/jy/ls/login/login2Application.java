package com.jy.ls.login;/**
 *
 */

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author LENOVO
 * @date 2020/3/17 1:21
 */

@MapperScan(basePackages = {"com.jy.ls.login.Mapper"})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class login2Application {
    public static void main(String[] args) {
        SpringApplication.run(login2Application.class,args);
    }
}
