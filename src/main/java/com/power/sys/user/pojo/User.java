package com.power.sys.user.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/25 0025 下午 17:07
 * @Version 1.0
 */
@Data
@ToString
public class User {

    private Integer id;

    private String username;

    private String password;
}
