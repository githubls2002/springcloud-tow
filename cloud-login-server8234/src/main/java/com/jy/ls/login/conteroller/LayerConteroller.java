package com.jy.ls.login.conteroller;/**
 *
 */

import com.jy.ls.login.Entity.CommonResult;
import com.jy.ls.login.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LENOVO
 * @date 2020/3/17 1:39
 */
@RestController
@RequestMapping("/teng")
public class LayerConteroller {

    @Value("${server.port}")
    String ind;

    @Autowired
    InterfaceService interfaceSe;

    @GetMapping("/login")
    public CommonResult login(String account,String password){
        return interfaceSe.login(account,password);
    }



    @GetMapping("/FinallUser")
    public CommonResult FinallUser(){
        return interfaceSe.FinallUser();
    }
    @GetMapping("/port")
    public String port(){
        return this.ind;
    }
}
