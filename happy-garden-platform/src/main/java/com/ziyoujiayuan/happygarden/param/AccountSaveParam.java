package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class AccountSaveParam extends DefBaseParam {

    private String accountId;

    private String accountName;

    private String wechatNickname;

    private String wechatOpenId;

    private String wechatMpOpenId;

    private String wechatUnionId;

    private String wechatHeader;

    private Integer type;

    private String mobile;

    private String email;

    private String password;
}
