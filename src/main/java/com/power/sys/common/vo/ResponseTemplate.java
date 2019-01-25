package com.power.sys.common.vo;

import lombok.Data;
import lombok.Value;

/**
 * @ClassName ResponseTemplate
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/23 0023 下午 14:39
 * @Version 1.0
 */
@Data
public class ResponseTemplate {

    private int status = 200;
    private String message = "SUCCESS";
    private Object data;
}
