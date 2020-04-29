package com.intellif.smartcampus.vo;

import com.intellif.smartcampus.enums.ResultCodeEnum;
import lombok.Data;

@Data
public class BaseResponseVo {
    /**
     * 返回码
     */
    private String code = ResultCodeEnum.SUCCESS.code;
    /**
     * 请求成功失败的标志success,failed
     */
    private String status = ResultCodeEnum.SUCCESS.name;
    /**
     * 返回信息
     */
    private String message = "";
    /**
     * 返回数据
     */
    private Object data;

    public BaseResponseVo(String code, String status, String message, Object data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功
     */
    public static BaseResponseVo ok() {
        ResultCodeEnum resultCodeEnum = ResultCodeEnum.SUCCESS;
        return new BaseResponseVo(resultCodeEnum.code, resultCodeEnum.name, resultCodeEnum.message, null);
    }

    /**
     * 成功
     * 返回成功数据
     */
    public static BaseResponseVo ok(Object data) {
        ResultCodeEnum resultCodeEnum = ResultCodeEnum.SUCCESS;
        return new BaseResponseVo(resultCodeEnum.code, resultCodeEnum.name, resultCodeEnum.message, data);
    }

    /**
     * 失败
     */
    public static BaseResponseVo error() {
        ResultCodeEnum resultCodeEnum = ResultCodeEnum.FAILED;
        return new BaseResponseVo(resultCodeEnum.code, resultCodeEnum.name, resultCodeEnum.message, null);
    }

    /**
     * 失败
     * 返回失败错误码
     */
    public static BaseResponseVo error(ResultCodeEnum resultCodeEnum) {
        return new BaseResponseVo(resultCodeEnum.code, resultCodeEnum.name, resultCodeEnum.message, null);
    }
}
