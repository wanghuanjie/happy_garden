package com.ziyoujiayuan.happygarden.controller.login;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录管理
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
public class LoginController extends BaseController {

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
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 登出
     *
     * @param accountId
     * @return
     */
    @RequestMapping("/logout.action")
    @ResponseBody
    public AjaxResult logout(String accountId) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
