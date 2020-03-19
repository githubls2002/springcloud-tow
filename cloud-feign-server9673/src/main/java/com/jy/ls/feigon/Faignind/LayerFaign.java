package com.jy.ls.feigon.Faignind;/**
 *
 */


import com.jy.ls.feigon.Entity.CommonResult;
import com.jy.ls.feigon.Faignind.impl.FeignError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LENOVO
 * @date 2020/3/17 1:39
 */
// 声明式接口
@FeignClient(value = "cloud-login",fallback = FeignError.class)// 这个是注册 到注册中心的名字
public interface LayerFaign {
    @GetMapping("/teng/FinallUser")
    CommonResult FinallUser();
    @GetMapping("/teng/port")
    String port();
}
