package com.jy.ls.login.Service;

import com.jy.ls.login.Entity.CommonResult;

/**
 *
 */
public interface InterfaceService {

    CommonResult login(String account,String password);
//    Integer xiugai(String account,String password);
    CommonResult FinallUser();
}
