package com.ziyoujiayuan.happygarden.entity.def;

import com.hbxhx.runtime.base.db.BasePO;
import lombok.Data;

import java.util.Date;

/**
 * t_account
 * @author 
 */
@Data
public class AccountDefPO extends BasePO {
    /**
     * 用户id
     */
    private String accountId;

    /**
     * 用户昵称
     */
    private String accountName;

    private String wechatNickname;

    /**
     * 微信openid
     */
    private String wechatOpenId;

    /**
     * 微信openid
     */
    private String wechatMpOpenId;

    /**
     * 微信unionid
     */
    private String wechatUnionId;

    /**
     * 微信头像
     */
    private String wechatHeader;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;
}