package com.power.sys.user.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @ClassName User
 * @Description 用户对象
 * @Author Administrator
 * @Date 2019/1/25 0025 下午 17:07
 * @Version 1.0
 */
@Data
@ToString
@Table(name = "tb_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    @NotEmpty(message = "用户名不能为空")
    @Length(min = 4, max = 32, message = "用户名长度必须在4~32位")
    private String username; // 用户名

    @JsonIgnore //返回json数据时不返回密码
    @NotEmpty(message = "密码不能为空")
    @Length(min = 4, max = 32, message = "密码长度必须在4~32位")
    private  String password; // 密码

    // Pattern注解：被注释标记的元素必须符合指定的正则表达式
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$", message = "手机号码格式不正确")
    private String phone; // 电话号码

    private Date created; // 创建时间

    @JsonIgnore
    private String salt; // 加的盐值
}
