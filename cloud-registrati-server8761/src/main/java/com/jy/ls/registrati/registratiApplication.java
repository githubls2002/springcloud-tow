package com.jy.ls.registrati;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LENOVO
 * @date 2020/3/17 1:17
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class registratiApplication {
    public static void main(String[] args) {
        SpringApplication.run(registratiApplication.class,args);
    }
}
