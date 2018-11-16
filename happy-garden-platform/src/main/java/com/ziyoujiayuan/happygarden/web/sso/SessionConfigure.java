package com.ziyoujiayuan.happygarden.web.sso;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanghjbuf
 * @date 2018/11/15
 */
@Data
@Configuration
public class SessionConfigure {

    @Value("${sso.session.expiration}")
    private int sessionExpiration = 3600;

    @Value("${sso.session.prefix}")
    private String sessionPrefix = "token:";

    @Value("${sso.header.token.name}")
    private String tokenName = "current_token";

    @Value("${sso.isOpen}")
    private boolean isOpen = true;
}
