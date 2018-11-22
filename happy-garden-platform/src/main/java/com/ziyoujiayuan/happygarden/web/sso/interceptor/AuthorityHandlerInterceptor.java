package com.ziyoujiayuan.happygarden.web.sso.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.core.spring.SpringContextHolder;
import com.hbxhx.runtime.web.HttpAssistor;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import com.ziyoujiayuan.happygarden.web.sso.SessionConfigure;
import com.ziyoujiayuan.happygarden.web.sso.enums.OnlineUserTypeEnum;
import com.ziyoujiayuan.happygarden.web.sso.pojo.UserBasicInfo;
import com.ziyoujiayuan.happygarden.web.sso.service.AccountSsoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 权限拦截器
 *
 * @Author wanghjbuf
 * @Date 2017年10月19日
 */
@Slf4j
public class AuthorityHandlerInterceptor implements HandlerInterceptor {
	
	private AccountSsoService accountSsoService;
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
			arg1.setCharacterEncoding("UTF-8");
			arg1.setContentType("application/json; charset=utf-8");

			PrintWriter out = arg1.getWriter();
			JSONObject result = new JSONObject();
			result.put("code", AjaxResultEnum.NO_LOGIN.getCode());
			result.put("message", AjaxResultEnum.NO_LOGIN.getMessage());
            result.put("status", true);
			result.put("data", null);
			out.write(result.toString());

			return false;
		}
	}
	
	/**
	 * 从RequestHeader中获取当前用户信息
	 *
	 * @param httpServletRequest
	 * @return
	 */
	private boolean getToken4Header(HttpServletRequest httpServletRequest) {

		if (sessionConfigure == null) {
			sessionConfigure = (SessionConfigure)SpringContextHolder.getBean("sessionConfigure");
		}

	    String token = httpServletRequest.getHeader(sessionConfigure.getTokenName());
	    if (null != token && !"".equals(token)) {
	    	if (accountSsoService == null) {
				accountSsoService = (AccountSsoService)SpringContextHolder.getBean("accountSsoService");
			}

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
