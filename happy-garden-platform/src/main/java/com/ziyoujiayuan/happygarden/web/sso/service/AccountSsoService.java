package com.ziyoujiayuan.happygarden.web.sso.service;

import com.hbxhx.runtime.redis.template.HbhxhRedisTemplate;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import com.ziyoujiayuan.happygarden.web.sso.SessionConfigure;
import com.ziyoujiayuan.happygarden.web.sso.pojo.UserBasicInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Set;

/**
 * @author wanghjbuf
 * @date 2018/11/15
 */
@Service
public class AccountSsoService {

    @Resource
    private HbhxhRedisTemplate hbhxhRedisTemplate;
    @Resource
    private SessionConfigure sessionConfigure;

    /**
     * 获取用处基础信息
     *
     * @param token
     * @return
     */
    public UserBasicInfo getUserBasicInfo(String token)  {
        UserBasicInfo userBasicInfo = null;
        if (hbhxhRedisTemplate.exists(token)) {
            hbhxhRedisTemplate.expire(token, sessionConfigure.getSessionExpiration());

            userBasicInfo = (UserBasicInfo)hbhxhRedisTemplate.get(token);
        }

        return userBasicInfo;
    }

    /**
     * 登录处理
     *
     * @param accountId
     * @param accountName
     * @param mobile
     * @param email
     * @return
     */
    public String login(String accountId, String accountName, String mobile, String email) {

        UserBasicInfo userBasicInfo = new UserBasicInfo();
        userBasicInfo.setAccount(mobile);
        userBasicInfo.setEmail(email);
        userBasicInfo.setUserId(accountId);
        userBasicInfo.setUserName(accountName);

        String token = UuidUtils.getUUID();
        StringBuffer sessionId = new StringBuffer(sessionConfigure.getSessionPrefix());
        sessionId.append(accountId).append(":").append(UuidUtils.getUUID());
        userBasicInfo.setToken(token.toString());
        userBasicInfo.setSessionId(sessionId.toString());

        if (sessionConfigure.isOpen()) {
            StringBuffer sessionPattern = new StringBuffer(sessionConfigure.getSessionPrefix());
            sessionPattern.append(accountId).append(":").append("*");
            Set<String> keys = hbhxhRedisTemplate.keys(sessionPattern.toString());
            keys.forEach(key -> {
                hbhxhRedisTemplate.delKey(key);
            });
        }

        hbhxhRedisTemplate.set(sessionId.toString(), userBasicInfo, sessionConfigure.getSessionExpiration());
        return sessionId.toString();
    }

    /**
     * 登出处理
     *
     * @param httpServletRequest
     * @return
     */
    public void logout(HttpServletRequest httpServletRequest) {
        String current_token = httpServletRequest.getHeader(sessionConfigure.getTokenName());

        hbhxhRedisTemplate.delKey(current_token);
        OnlineUser.clean();
    }
}
