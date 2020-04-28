package com.intellif.smartcampus.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    @ApiModelProperty("用户id")
    private Integer id;

    @ApiModelProperty("用户名称")
    private String name;

    @ApiModelProperty("用户年龄")
    private Integer age;
}