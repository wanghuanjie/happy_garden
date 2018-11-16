package com.ziyoujiayuan.happygarden.web.sso.interceptor;

import com.hbxhx.runtime.base.exception.InternalException;
import com.hbxhx.runtime.web.HttpAssistor;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import com.ziyoujiayuan.happygarden.web.sso.SessionConfigure;
import com.ziyoujiayuan.happygarden.web.sso.enums.OnlineUserTypeEnum;
import com.ziyoujiayuan.happygarden.web.sso.pojo.UserBasicInfo;
import com.ziyoujiayuan.happygarden.web.sso.service.AccountSsoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限拦截器
 *
 * @Author wanghjbuf
 * @Date 2017年10月19日
 */
@Slf4j
@Component
public class AuthorityHandlerInterceptor implements HandlerInterceptor {
	
    @Resource
	private AccountSsoService accountSsoService;
    @Resource
	private SessionConfigure sessionConfigure;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {

		if (getToken4Header(arg0)) {
			return true;
		} else {
			throw new InternalException("system_error, please login again");
		}
	}
	
	/**
	 * 从RequestHeader中获取当前用户信息
	 *
	 * @param httpServletRequest
	 * @return
	 * @throws Exception
	 */
	private boolean getToken4Header(HttpServletRequest httpServletRequest) throws Exception{
	    String token = httpServletRequest.getHeader(sessionConfigure.getTokenName());

	    if (null != token && !"".equals(token)) {
		    UserBasicInfo userBasicInfo = accountSsoService.getUserBasicInfo(token);
		    if (userBasicInfo != null) {

				OnlineUser.current().setUserBasicInfo(userBasicInfo);
				OnlineUser.current().setSessionId(token);
				OnlineUser.current().setType(OnlineUserTypeEnum.USER.name());
				OnlineUser.current().setType(HttpAssistor.getIp(httpServletRequest));
				return true;
			} 
		}
	    return false;
	}
}
