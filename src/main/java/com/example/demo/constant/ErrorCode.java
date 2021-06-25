package com.example.demo.constant;

public enum ErrorCode {
    SUCCESS("00", "成功"),
    FAIL("55", "失败")
    ;

    public String code;
    public String desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
