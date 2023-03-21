package com.neutron.usercenterbackend;
import java.util.Date;

import com.neutron.usercenterbackend.model.entity.User;
import com.neutron.usercenterbackend.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserCenterBackendApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        User one = userService.query().eq("username", "neutron").one();
        Assertions.assertEquals("173563770941", one.getPhone());


    }

}
