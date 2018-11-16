package com.ziyoujiayuan.happygarden.web.sso;

import com.ziyoujiayuan.happygarden.web.sso.enums.OnlineUserTypeEnum;
import com.ziyoujiayuan.happygarden.web.sso.pojo.UserBasicInfo;
import lombok.Data;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.io.Serializable;

/**
 * 当前用户
 *
 * @Author wanghjbuf
 * @Date 2017年10月19日
 */
@SuppressWarnings("serial")
@Data
public class OnlineUser implements Serializable{
	public static final String ONLINE_UESER = "online_user";
	
	public static OnlineUser current() {
		RequestAttributes att = RequestContextHolder.currentRequestAttributes();
		OnlineUser onlineUser = (OnlineUser) att.getAttribute(ONLINE_UESER, RequestAttributes.SCOPE_SESSION);
		if (onlineUser == null) {
			onlineUser = new OnlineUser();
			att.setAttribute(ONLINE_UESER, onlineUser, RequestAttributes.SCOPE_SESSION);
		}
		return onlineUser;
	}
	
	public static void clean() {
		RequestContextHolder.currentRequestAttributes().removeAttribute(ONLINE_UESER, RequestAttributes.SCOPE_SESSION);
	}
	
	private boolean isOnline = true;
	private String type = OnlineUserTypeEnum.GUEST.name();
	private UserBasicInfo userBasicInfo;
	private String sessionId;
    private String ipAddr;
}
