package com.jy.ls.hystrix.conteroller;/**
 *
 */

import com.jy.ls.hystrix.Entity.CommonResult;
import com.jy.ls.hystrix.Faignind.LayerFaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LENOVO
 * @date 2020/3/17 20:59
 */
@RestController
@RequestMapping("/teng")
public class FeigConteroller {
    @Autowired
    private LayerFaign layerFaign;

    @GetMapping("/FinallUser")
    public CommonResult FinallUser(){
        return layerFaign.FinallUser();
    }
    @GetMapping("/port")
    public String port(){
        return layerFaign.port();
    }
}
