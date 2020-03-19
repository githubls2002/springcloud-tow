package com.jy.ls.feigon.Entity;/**
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LENOVO
 * @date 2020/3/17 1:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String account;
    private String password;
}
