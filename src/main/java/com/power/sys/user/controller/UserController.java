package com.power.sys.user.controller;

import com.power.sys.common.vo.ResponseTemplate;
import com.power.sys.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author Administrator
 * @Date 2019/1/25 0025 下午 17:09
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 给你描述：实现用户数据的校验，主要包括：用户名和手机号的唯一性校验
     * @param data  要校验的数据
     * @param type  要校验的数据类型，1-用户名，2-手机号
     * @return
     */
    @GetMapping("check/{data}/{type}")
    public ResponseTemplate checkData(
            @PathVariable(value = "data", required = true) String data,
            @PathVariable(value = "type", required = true) Integer type)
    {
        Boolean isEnable = userService.checkData(data, type);

        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setData(isEnable);
        return responseTemplate;
    }

}
