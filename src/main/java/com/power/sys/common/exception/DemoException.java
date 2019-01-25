package com.power.sys.common.exception;

import com.power.sys.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName DemoException
 * @Description Demo异常处理器
 * @Author hjq
 * @Date 2019/1/23 0023 上午 10:34
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DemoException extends RuntimeException{

    private ExceptionEnum exceptionEnum;

}
