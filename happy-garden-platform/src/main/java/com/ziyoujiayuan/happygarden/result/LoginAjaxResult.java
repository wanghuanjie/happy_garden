package com.ziyoujiayuan.happygarden.result;

import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/20
 */
@Data
public class LoginAjaxResult {

    private String token;

    private long tokenExpireTime;

    private String code;
}
