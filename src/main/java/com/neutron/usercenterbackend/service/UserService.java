package com.neutron.usercenterbackend.service;

import com.neutron.usercenterbackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neutron.usercenterbackend.model.request.UserRegisterRequest;

/**
* @author zzs
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-03-21 15:12:31
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userRegisterRequest 用户注册实体类（账号、密码、校验密码、公司编号）
     * @return 新用户id
     */
    public long userRegister(UserRegisterRequest userRegisterRequest);

}
