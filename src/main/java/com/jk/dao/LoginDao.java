package com.jk.dao;

import com.jk.pojo.LoginBean;

import org.apache.ibatis.annotations.Param;

public interface LoginDao {


    LoginBean LoginUser(@Param("name") String name, @Param("password") String password);
}
