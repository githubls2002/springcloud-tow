package com.jy.ls.feigon.Faignind.impl;/**
 *
 */

import com.jy.ls.feigon.Entity.CommonResult;
import com.jy.ls.feigon.Faignind.LayerFaign;
import org.springframework.stereotype.Component;

/**
 * @author LENOVO
 * @date 2020/3/17 21:17
 */
@Component
public class FeignError implements LayerFaign {
    @Override
    public CommonResult FinallUser() {
        return null;
    }

    @Override
    public String port() {
        return "服务器维护中";
    }
}
