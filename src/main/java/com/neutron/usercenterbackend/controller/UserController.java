package com.neutron.usercenterbackend.controller;

import cn.hutool.core.bean.BeanUtil;
import com.neutron.usercenterbackend.common.BaseResponse;
import com.neutron.usercenterbackend.common.ErrorCode;
import com.neutron.usercenterbackend.common.ResultUtils;
import com.neutron.usercenterbackend.exception.BusinessException;
import com.neutron.usercenterbackend.model.request.UserRegisterRequest;
import com.neutron.usercenterbackend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zzs
 * @date 2023/3/21 15:58
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public BaseResponse<Long> userRegisterController(@RequestBody UserRegisterRequest userRegisterRequest){
        if(userRegisterRequest == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        boolean flag = BeanUtil.hasNullField(userRegisterRequest);
        if(flag){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "参数不能为空");
        }
        long userId = userService.userRegister(userRegisterRequest);

        return ResultUtils.success(userId);
    }


}
