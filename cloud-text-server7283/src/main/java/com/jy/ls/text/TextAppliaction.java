package com.jy.ls.text;/**
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author LENOVO
 * @date 2020/3/18 15:32
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TextAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(TextAppliaction.class,args);
    }
}
