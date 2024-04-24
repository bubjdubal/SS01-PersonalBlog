package com.bubj.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 博客
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    // id
    private String id;
    // 标题
    private String title;
    // 描述
    private String description;
    // 正文
    private String content;
    // 阅读量
    private Integer views;
    // TODO
    private String published;
    // 创建时间
    private Date createTime;
    // 标题图片
    private String titleImage;
    // 类别
    private Category category;
    // 撰写者
    private User user;
}
