package com.jy.ls.congithub;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LENOVO
 * @date 2020/3/20 4:54
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableConfigServer
@EnableEurekaClient
public class CongithubApplication {
    public static void main(String[] args) {
        SpringApplication.run(CongithubApplication.class,args);
    }
}
