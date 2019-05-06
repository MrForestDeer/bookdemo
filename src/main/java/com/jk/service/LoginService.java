package com.jk.service;

import com.jk.pojo.LoginBean;


import java.util.HashMap;

public interface LoginService {
    HashMap<String,Object> LoginUser(LoginBean loginBean);
}
