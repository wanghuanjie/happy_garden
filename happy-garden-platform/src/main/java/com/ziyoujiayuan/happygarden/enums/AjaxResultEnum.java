package com.ziyoujiayuan.happygarden.enums;

import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public enum AjaxResultEnum {

    SUCCESS("100000", "success");

    private String code;
    private String message;

    AjaxResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
