package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;

import com.jk.dao.LoginDao;
import com.jk.pojo.LoginBean;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.HashMap;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;

    @Override
    public HashMap<String, Object> LoginUser(LoginBean loginBean) {

        HashMap<String, Object> hashMap = new HashMap<>();
        LoginBean login= loginDao.LoginUser(loginBean.getName(),loginBean.getPassword());
        if (login != null) {
            hashMap.put("msg","登陆成功");
            hashMap.put("code","0");
            return hashMap;
        }else {
            hashMap.put("msg","登陆失败");
            hashMap.put("code","1");

            return hashMap;
        }

    }
}
