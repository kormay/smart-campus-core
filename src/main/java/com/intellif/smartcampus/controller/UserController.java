package com.intellif.smartcampus.controller;

import com.intellif.smartcampus.entity.User;
import com.intellif.smartcampus.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("新增用户")
    @PostMapping(value = "/add")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @ApiOperation("用户列表")
    @GetMapping(value = "/list/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}