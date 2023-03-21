package com.neutron.usercenterbackend.controller;

import com.neutron.usercenterbackend.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zzs
 * @date 2023/3/21 15:58
 */
@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;




}
