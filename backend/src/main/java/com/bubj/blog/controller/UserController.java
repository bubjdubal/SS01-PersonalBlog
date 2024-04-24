package com.bubj.blog.controller;

import com.bubj.blog.common.Result;
import com.bubj.blog.pojo.User;
import com.bubj.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @GetMapping("/")
    public Result selectPage(
            @RequestParam(required = true, defaultValue = "1", value = "pageNum") Integer pageNum,
            @RequestParam(required = true, defaultValue = "10", value = "pageSize") Integer pageSize,
            @RequestParam(required = false, defaultValue = "", value = "username") String username,
            @RequestParam(required = false, defaultValue = "", value = "role") String role) {
        int startIndex = (pageNum - 1) * pageSize;
        int total = userService.selectCount(username, role);
        List<User> userList = userService.selectPage(startIndex, pageSize, username, role);
        Result result = new Result().success();
        result.set("total", total).set("userList", userList);
        return result;
    }

    @GetMapping("/{id}")
    public User selectById(@PathVariable("id") String id) {
        return userService.selectById(id);
    }

    @PostMapping
    public Result save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id") String id) {
        return userService.deleteById(id);
    }
}
