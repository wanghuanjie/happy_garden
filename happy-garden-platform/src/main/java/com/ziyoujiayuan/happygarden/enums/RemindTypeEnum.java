package com.ziyoujiayuan.happygarden.enums;

/**
 * @author wanghjbuf
 * @date 2018/11/11
 */
public enum RemindTypeEnum {

    APPLY_FERTILIZER("apply_fertilizer", "施肥操作"),
    REPLACE_SOIL("replace_soil", "换土操作"),
    SPRAY_DRUG("spray_drug", "撒药操作"),
    SPRAY_WATER("spray_water", "喷水操作"),
    WATERING("watering", "浇水操作");

    private String code;
    private String remark;

    RemindTypeEnum(String code, String remark) {
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

    public static RemindTypeEnum getEnumByCode(String code) {
        for (RemindTypeEnum item : values()) {
            if (code.equals(item.getCode())) {
                return item;
            }
        }
        return null;
    }
}
