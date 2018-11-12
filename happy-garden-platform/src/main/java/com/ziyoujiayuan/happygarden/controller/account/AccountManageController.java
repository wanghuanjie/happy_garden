package com.ziyoujiayuan.happygarden.controller.account;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.AccountQueryParam;
import com.ziyoujiayuan.happygarden.param.AccountSaveParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/accountManage")
public class AccountManageController extends BaseController {

    /**
     * 用户查询
     *
     * @param accountQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(AccountQueryParam accountQueryParam) {
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null, accountQueryParam.getDraw());
    }

    /**
     * 用户保存
     *
     * @param accountSaveParam
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(AccountSaveParam accountSaveParam) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 用户删除
     *
     * @param accountId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String accountId) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 用户下拉选
     *
     * @return
     */
    @RequestMapping("/pubsel.action")
    @ResponseBody
    public AjaxResult pubsel() {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
