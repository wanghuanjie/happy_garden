package com.ziyoujiayuan.happygarden.enums;

/**
 * @author wanghjbuf
 * @date 2018/11/11
 */
public enum RemindModeEnum {

    AT("at", "at"),
    CRON("cron", "年");

    private String code;
    private String remark;

    RemindModeEnum(String code, String remark) {
       this.code = code;
       this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
