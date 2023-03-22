package com.neutron.usercenterbackend;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.hutool.core.bean.BeanUtil;
import com.neutron.usercenterbackend.model.dto.UserDTO;
import com.neutron.usercenterbackend.model.entity.User;
import com.neutron.usercenterbackend.model.request.UserRegisterRequest;
import com.neutron.usercenterbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class UserCenterBackendApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(0L);
        user.setUsername("demo");
        user.setUserAccount("123");
        user.setAvatarUrl("12312313");
        user.setGender(0);
        user.setUserPassword("137911");
        user.setPhone("");
        user.setEmail("");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);
        user.setUserRole(0);
        user.setUserCode("456");

        UserDTO userDTO = new UserDTO();
        BeanUtil.copyProperties(user, userDTO);
        log.info(userDTO.toString());
        Assertions.assertNotNull(userDTO);


    }

}
