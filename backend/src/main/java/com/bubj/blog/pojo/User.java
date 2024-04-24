package com.bubj.blog.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 */
@Data
public class User {

    // id
    private String id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 昵称
    private String nickname;
    // 头像
    private String avatar;
    // 角色
    private String role;
    // 拥有的博客
    private List<Blog> blogs = new ArrayList<>();
}
