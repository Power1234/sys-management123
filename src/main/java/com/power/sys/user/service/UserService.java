package com.power.sys.user.service;

import com.power.sys.common.enums.ExceptionEnum;
import com.power.sys.common.exception.DemoException;
import com.power.sys.user.mapper.UserMapper;
import com.power.sys.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description
 * @Author Administrator
 * @Date 2019/1/23 0023 上午 9:48
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public Boolean checkData(String data, Integer type) {
        User record = new User();
        // 判断数据类型
        switch (type){
            case 1:
                record.setUsername(data);
                break;
            case 2:
                record.setPhone(data);
                break;
            default:
                throw new DemoException(ExceptionEnum.INVALID_USER_DATA_TYPE);
        }
        // 校验数据
        return userMapper.selectCount(record) == 0;
    }
}
