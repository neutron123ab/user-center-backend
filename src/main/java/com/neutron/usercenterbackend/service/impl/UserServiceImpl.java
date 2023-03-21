package com.neutron.usercenterbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neutron.usercenterbackend.model.entity.User;
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

}




