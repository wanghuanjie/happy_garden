package com.ziyoujiayuan.happygarden.web.controller.cultivate;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterSaveParam;
import com.ziyoujiayuan.happygarden.service.SprayWaterManageService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 喷水记录管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/sprayWaterManage")
public class SprayWaterManageController extends BaseController {

    @Resource
    private SprayWaterManageService sprayWaterManageService;

    /**
     * 喷水记录查询
     *
     * @param sprayWaterQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(SprayWaterQueryParam sprayWaterQueryParam) {
        sprayWaterQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, sprayWaterManageService.query(sprayWaterQueryParam), sprayWaterQueryParam.getDraw());
    }

    /**
     * 喷水记录保存
     *
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(SprayWaterSaveParam sprayWaterSaveParam) {
        sprayWaterSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        sprayWaterSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, sprayWaterManageService.save(sprayWaterSaveParam));
    }

    /**
     * 喷水记录删除
     *
     * @param recordId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String recordId) {
        sprayWaterManageService.del(recordId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
