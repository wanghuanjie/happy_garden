package com.ziyoujiayuan.happygarden.web.controller.cultivate;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilSaveParam;
import com.ziyoujiayuan.happygarden.service.ReplaceSoilManageService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 换土记录管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/replaceSoilManage")
public class ReplaceSoilManageController extends BaseController {

    @Resource
    private ReplaceSoilManageService replaceSoilManageService;

    /**
     * 换土记录查询
     *
     * @param replaceSoilQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(ReplaceSoilQueryParam replaceSoilQueryParam) {
        replaceSoilQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, replaceSoilManageService.query(replaceSoilQueryParam), replaceSoilQueryParam.getDraw());
    }

    /**
     * 换土记录保存
     *
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(ReplaceSoilSaveParam replaceSoilSaveParam) {
        replaceSoilSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        replaceSoilSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, replaceSoilManageService.save(replaceSoilSaveParam));
    }

    /**
     * 换土记录删除
     *
     * @param recordId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String recordId) {
        replaceSoilManageService.del(recordId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}