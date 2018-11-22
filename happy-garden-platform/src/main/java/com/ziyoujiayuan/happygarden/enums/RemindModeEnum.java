package com.ziyoujiayuan.happygarden.enums;

/**
 * @author wanghjbuf
 * @date 2018/11/11
 */
public enum RemindModeEnum {

    AT(0, "at"),
    YEAR(1, "年"),
    MONTH(2, "月"),
    DAY(3, "日");

    private Integer code;
    private String remark;

    RemindModeEnum(Integer code, String remark) {
       this.code = code;
       this.remark = remark;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static RemindModeEnum getEnumByCode(Integer code) {
        for (RemindModeEnum item : values()) {
            if (item.getCode().intValue() == code.intValue()) {
                return item;
            }
        }
        return null;
    }
}
