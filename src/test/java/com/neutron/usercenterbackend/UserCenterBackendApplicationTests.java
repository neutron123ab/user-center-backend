package com.neutron.usercenterbackend;
import java.util.Date;

import cn.hutool.core.bean.BeanUtil;
import com.neutron.usercenterbackend.model.entity.User;
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
        User user = new User();
        user.setId(1L);
        Assertions.assertTrue(BeanUtil.hasNullField(user));


    }

}
