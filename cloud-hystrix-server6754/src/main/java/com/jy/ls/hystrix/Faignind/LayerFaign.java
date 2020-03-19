package com.jy.ls.hystrix.Faignind;/**
 *
 */



import com.jy.ls.hystrix.Entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LENOVO
 * @date 2020/3/17 1:39
 */
// 声明式接口
@FeignClient(value = "cloud-login")// 这个是注册 到注册中心的名字
public interface LayerFaign {
    @GetMapping("/teng/FinallUser")
    CommonResult FinallUser();
    @GetMapping("/teng/port")
    String port();
}
