package com.ziyoujiayuan.happygarden.web.sso.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Set;

/**
 * 用户基础信息
 * @Author wanghjbuf
 * @Date 2017年10月19日
 */
@SuppressWarnings("serial")
@Data
@Slf4j
public class UserBasicInfo implements Serializable{

	private String userId;
	private String userName;
	private String token;
	private String sessionId;
	private String account;
	private String email;

	private long roleId;
	private String roleName;
	private Set<PrivilegeBasicInfo> privileges;
	
	/**
	 * 判断当前用户是否存在当前权限
	 *
	 * @param privileges
	 * @return
	 */
	public boolean containPrivilege(String privileges) {

		log.info("privileges:{};", privileges);
		return false;
	}
	
}
