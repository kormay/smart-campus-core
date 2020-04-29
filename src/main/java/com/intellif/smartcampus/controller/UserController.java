package com.intellif.smartcampus.controller;

import com.intellif.smartcampus.entity.User;
import com.intellif.smartcampus.enums.ResultCodeEnum;
import com.intellif.smartcampus.service.UserService;
import com.intellif.smartcampus.vo.BaseResponseVo;
import com.intellif.smartcampus.vo.UserVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("新增用户")
    @PostMapping(value = "/add")
    public BaseResponseVo addUser(@RequestBody UserVo userVo) {
        int age = userVo.getAge();
        String name = userVo.getName();

        if (age <= 0 || name == null || name.equals("")) {
            return BaseResponseVo.error(ResultCodeEnum.INVALID_PARAMS);
        }

        try {
            User user = new User();
            user.setAge(userVo.getAge());
            user.setName(userVo.getName());
            userService.addUser(user);
        } catch (Exception e) {
            return BaseResponseVo.error();
        }
        return BaseResponseVo.ok();
    }

    @ApiOperation("用户列表")
    @GetMapping(value = "/list/{pageNum}/{pageSize}")
    public BaseResponseVo findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        List<User> users = userService.findAllUser(pageNum, pageSize);
        return BaseResponseVo.ok(users);
    }
}