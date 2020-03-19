package com.jy.ls.login.Mapper;

import com.jy.ls.login.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 *
 */
@Mapper
public interface OperatingDao {
    @Select("select * from user where account=#{0}")
    User finbyAccount(String account);

    @Update("UPDATE cs_user SET password = #{password} WHERE account =#{account} ")
    Integer xiugai(@Param("account") String account,@Param("password") String passwprd);

    @Select("select * from user")
    List<User>  FinallUser();
}