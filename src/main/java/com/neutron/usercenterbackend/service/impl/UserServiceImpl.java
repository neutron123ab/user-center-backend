package com.neutron.usercenterbackend.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neutron.usercenterbackend.model.entity.User;
import com.neutron.usercenterbackend.model.request.UserRegisterRequest;
import com.neutron.usercenterbackend.service.UserService;
import com.neutron.usercenterbackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author zzs
 * @description 针对表【user(用户表)】的数据库操作Service实现
 * @createDate 2023-03-21 15:12:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Override
    public long userRegister(UserRegisterRequest userRegisterRequest) {

        //1.接收到的参数是否为空
        if (BeanUtil.hasNullField(userRegisterRequest)) {

        }


        //2.账号长度 >= 4

        //3.密码/校验密码长度 >= 8

        //4.公司编号1-5位

        //6.账号不能包含特殊字符

        //7.判断密码与校验密码是否相同

        //8.查数据库，账号不能重复

        //9.查数据库，公司编号不能重复

        //10.密码加密，存入数据库

        //11.返回



        return 0;
    }
}




