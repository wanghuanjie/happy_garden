package com.ziyoujiayuan.happygarden.web.controller.login;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.web.BaseController;
import com.hbxhx.utils.encrypt.EncryptUtils;
import com.ziyoujiayuan.happygarden.entity.auto.AccountPO;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.service.AccountService;
import com.ziyoujiayuan.happygarden.web.sso.service.AccountSsoService;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 登录管理
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Slf4j
@Controller
public class LoginController extends BaseController {

    @Resource
    private AccountService accountService;
    @Resource
    private AccountSsoService accountSsoService;

    @RequestMapping("/login")
    public String loginPage() {
        return "base/login";
    }

    /**
     * 登入
     *
     * @param accountName
     * @param password
     * @return
     */
    @RequestMapping("/login.action")
    @ResponseBody
    public AjaxResult login(String accountName, String password) {

        String result ;
        password = EncryptUtils.md5_sha(password);
        AccountPO accountPO = accountService.getDetails(accountName);
        try {
            if (!password.equals(accountPO.getPassword())) {
                throw new InternalException("accountName or password is error");
            }
            result = accountSsoService.login(accountPO.getAccountId(), accountPO.getAccountName(), accountPO.getMobile(), accountPO.getEmail());

        } catch (Exception e) {
            log.info("login happen system error", e);
            return new AjaxResult(AjaxResultEnum.LOGIN_ERROR.getCode(), AjaxResultEnum.LOGIN_ERROR.getMessage(), false, null);
        }
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, result);
    }

    /**
     * 登出
     *
     * @return
     */
    @RequestMapping("/logout.action")
    @ResponseBody
    public AjaxResult logout(HttpServletRequest httpServletRequest) {
        try {

            accountSsoService.logout(httpServletRequest);
        } catch (Exception e) {
            log.info("logout happen system error", e);
            return new AjaxResult(AjaxResultEnum.LOGOUT_ERROR.getCode(), AjaxResultEnum.LOGOUT_ERROR.getMessage(), false, null);
        }
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
