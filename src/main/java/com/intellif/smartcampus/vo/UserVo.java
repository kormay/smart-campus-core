package com.intellif.smartcampus.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserVo {
//    @ApiModelProperty("用户id")
//    private Integer id;

    @ApiModelProperty("用户名称")
    private String name;

    @ApiModelProperty("用户年龄")
    private Integer age;
}
