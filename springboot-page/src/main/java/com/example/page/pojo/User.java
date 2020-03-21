package com.example.page.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhaojh0912
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 联系方式
     */
    private int telPhone;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 身高
     */
    private Long height;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个人网站博客
     */
    private String url;

    /**
     * 个人介绍
     */
    private String describe;


}
