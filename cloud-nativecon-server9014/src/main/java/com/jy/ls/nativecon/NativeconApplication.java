package com.jy.ls.nativecon;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author LENOVO
 * @date 2020/3/18 15:19
 * 统一服务配置中心启动入口
 */
@EnableConfigServer
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class NativeconApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeconApplication.class,args);
    }
}
