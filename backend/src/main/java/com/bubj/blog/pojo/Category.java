package com.bubj.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 类别
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    // id
    private String id;
    // 名称
    private String name;
    // 该类别的文章
    private List<Blog> blogs = new ArrayList<>();
}
