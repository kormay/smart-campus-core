package com.intellif.smartcampus.enums;

public enum ResultCodeEnum {
    SUCCESS("0000", "SUCCESS", "成功"),
    FAILED("1000", "FAILED", "失败"),
    INVALID_PARAMS("1001", "INVALID_PARAM", "参数无效");

    public String code;
    public String name;
    public String message;

    ResultCodeEnum(String code, String name, String message) {
        this.code = code;
        this.name = name;
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}

