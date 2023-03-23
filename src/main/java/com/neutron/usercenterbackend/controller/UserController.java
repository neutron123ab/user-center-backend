package com.neutron.usercenterbackend.controller;

import cn.hutool.core.bean.BeanUtil;
import com.neutron.usercenterbackend.common.BaseResponse;
import com.neutron.usercenterbackend.common.ErrorCode;
import com.neutron.usercenterbackend.common.ResultUtils;
import com.neutron.usercenterbackend.exception.BusinessException;
import com.neutron.usercenterbackend.model.dto.UserDTO;
import com.neutron.usercenterbackend.model.request.UserLoginRequest;
import com.neutron.usercenterbackend.model.request.UserRegisterRequest;
import com.neutron.usercenterbackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static com.neutron.usercenterbackend.constant.UserConstant.USER_LOGIN_STATE;

/**
 * @author zzs
 * @date 2023/3/21 15:58
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
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

        return ResultUtils.success(userId, "注册成功");
    }

    @PostMapping("/login")
    public BaseResponse<UserDTO> userLoginController(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request){
        if(userLoginRequest == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        boolean flag = BeanUtil.hasNullField(userLoginRequest);
        if(flag){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "参数不能为空");
        }
        UserDTO userDTO = userService.userLogin(userLoginRequest, request);
        return ResultUtils.success(userDTO, "登录成功");
    }

    @GetMapping("/getUserInfo")
    public BaseResponse<UserDTO> getUserInfoController(HttpServletRequest request){
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        UserDTO userInfo = (UserDTO) userObj;
        if(userInfo == null) {
            throw new BusinessException(ErrorCode.NOT_LOGIN);
        }
        return ResultUtils.success(userInfo);
    }


}
