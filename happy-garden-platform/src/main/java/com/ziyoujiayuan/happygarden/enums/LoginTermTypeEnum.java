package com.ziyoujiayuan.happygarden.enums;

/**
 * @author wanghjbuf
 * @date 2018/11/21
 */
public enum LoginTermTypeEnum {

    MINI("mini", "小程序"),
    WEB("web", "网站"),
    ANDROID("android", "安卓"),
    IOS("ios", "苹果公司");

    private String type;
    private String remark;

    LoginTermTypeEnum(String type, String remark) {
        this.type = type;
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static LoginTermTypeEnum getEnumByType(String type) {
        for (LoginTermTypeEnum item : values()) {
            if (type.equals(item.getType())) {
                return item;
            }
        }
        return null;
    }
}
