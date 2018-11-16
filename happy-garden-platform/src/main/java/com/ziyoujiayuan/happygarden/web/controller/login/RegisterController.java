package com.ziyoujiayuan.happygarden.web.controller.login;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.AccountSaveParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注册管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
public class RegisterController extends BaseController {

    /**
     * 注册
     *
     * @param accountSaveParam
     * @return
     */
    @RequestMapping("/register.action")
    @ResponseBody
    public AjaxResult register(AccountSaveParam accountSaveParam) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
