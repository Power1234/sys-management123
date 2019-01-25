package com.power.sys.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName ExceptionEnum
 * @Description 异常处理枚举类
 * @Author Administrator
 * @Date 2019/1/23 0023 上午 10:37
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {

    INVALID_USER_DATA_TYPE(400, "用户数据类型无效")
    ;

    private int code;
    private String msg;
}
