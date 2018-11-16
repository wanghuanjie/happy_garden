package com.ziyoujiayuan.happygarden.enums;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public enum AjaxResultEnum {

    SUCCESS("100000", "success"),
    LOGIN_ERROR("100001", "login_error"),
    LOGOUT_ERROR("100002", "logout_error"),
    ERROR("111111", "system_error");

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
