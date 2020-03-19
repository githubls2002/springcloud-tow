package com.jy.ls.login.Service.achieve;/**
 *
 */

import com.jy.ls.login.Entity.CommonResult;
import com.jy.ls.login.Entity.User;
import com.jy.ls.login.Mapper.OperatingDao;
import com.jy.ls.login.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LENOVO
 * @date 2020/3/17 1:34
 */
@Service
public class InterfaceAchieve implements InterfaceService {
    @Autowired
    private OperatingDao operating;
    @Override
    public CommonResult login(String account, String password) {
        User  user=operating.finbyAccount(account);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return new CommonResult(200,"成功",null);
            }else{
                return new CommonResult(444,"密码错误",null);
            }
        }else{
            return new CommonResult(444,"没有此账号",null);
        }
    }

    @Override
    public Integer xiugai(String account, String password) {
        Integer in=operating.xiugai(account,password);
        return in;
    }

    @Override
    public CommonResult FinallUser() {
        List<User> user=operating.FinallUser();
        if(user!=null){
            return new CommonResult(200,"有数据",user);
        }else{
            return new CommonResult(444,"没有数据",null);
        }
    }
}
