package com.power.sys.common.vo;

import com.power.sys.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @ClassName ExceptionResult
 * @Description 异常结果
 * @Author Administrator
 * @Date 2019/1/23 0023 上午 10:50
 * @Version 1.0
 */
@Data
public class ExceptionResult {

    private int status;
    private String messgae;
    private Long timestamp; //时间挫

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.messgae = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }

}
