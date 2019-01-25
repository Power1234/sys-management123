package com.power.sys.common.advice;

import com.power.sys.common.enums.ExceptionEnum;
import com.power.sys.common.exception.DemoException;
import com.power.sys.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName CommonExceptionHandler
 * @Description 全局异常处理器
 * @Author Administrator
 * @Date 2019/1/23 0023 上午 10:42
 * @Version 1.0
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(DemoException.class)  //以后捕获自定义的异常就可以了
    public ResponseEntity<ExceptionResult> handleException(DemoException e){
        // 通过自定义异常类获取异常枚举类
        ExceptionEnum em = e.getExceptionEnum();
        // 通过异常枚举再获取自定义的异常信息
        return ResponseEntity.status(em.getCode()).body(new ExceptionResult(em));
    }

}
