package com.ziyoujiayuan.happygarden.web.controller.cultivate;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugSaveParam;
import com.ziyoujiayuan.happygarden.service.SpreadDrugManageService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 撒药记录管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/spreadDrugManage")
public class SpreadDrugManageController extends BaseController {

    @Resource
    private SpreadDrugManageService spreadDrugManageService;

    /**
     * 撒药记录查询
     *
     * @param spreadDrugQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(SpreadDrugQueryParam spreadDrugQueryParam) {
        spreadDrugQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, spreadDrugManageService.query(spreadDrugQueryParam), spreadDrugQueryParam.getDraw());
    }

    /**
     * 撒药记录保存
     *
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(SpreadDrugSaveParam spreadDrugSaveParam) {
        spreadDrugSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        spreadDrugSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, spreadDrugManageService.save(spreadDrugSaveParam));
    }

    /**
     * 撒药记录删除
     *
     * @param recordId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String recordId) {
        spreadDrugManageService.del(recordId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
