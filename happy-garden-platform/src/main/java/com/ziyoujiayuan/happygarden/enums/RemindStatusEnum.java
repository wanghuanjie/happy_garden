package com.ziyoujiayuan.happygarden.enums;

/**
 * @author wanghjbuf
 * @date 2018/11/11
 */
public enum RemindStatusEnum {

    INIT(0, "init", "初始化"),
    ENABLE(1, "enable", "启用"),
    DISABLE(2, "disable", "禁用");

    private Integer code;
    private String message;
    private String remark;

    RemindStatusEnum(Integer code, String message, String remark) {
       this.code = code;
       this.message = message;
       this.remark = remark;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
