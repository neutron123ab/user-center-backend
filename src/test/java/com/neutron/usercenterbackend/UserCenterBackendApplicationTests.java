package com.neutron.usercenterbackend;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.hutool.core.bean.BeanUtil;
import com.neutron.usercenterbackend.model.entity.User;
import com.neutron.usercenterbackend.model.request.UserRegisterRequest;
import com.neutron.usercenterbackend.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootTest
class UserCenterBackendApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        UserRegisterRequest userRegisterRequest = new UserRegisterRequest();
        userRegisterRequest.setUserAccount("demo1");
        userRegisterRequest.setUserPassword("123123123");
        userRegisterRequest.setCheckPassword("123123123");
        userRegisterRequest.setUserCode("3");


        long l = userService.userRegister(userRegisterRequest);
        Assertions.assertEquals(l, 3);

    }

}
