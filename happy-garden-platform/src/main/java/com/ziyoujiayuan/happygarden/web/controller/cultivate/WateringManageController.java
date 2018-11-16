package com.ziyoujiayuan.happygarden.web.controller.cultivate;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringSaveParam;
import com.ziyoujiayuan.happygarden.service.WateringManageService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 浇水记录管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/wateringManage")
public class WateringManageController extends BaseController {

    @Resource
    private WateringManageService wateringManageService;

    /**
     * 浇水记录查询
     *
     * @param wateringQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(WateringQueryParam wateringQueryParam) {
        wateringQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, wateringManageService.query(wateringQueryParam), wateringQueryParam.getDraw());
    }

    /**
     * 浇水记录保存
     *
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(WateringSaveParam wateringSaveParam) {
        wateringSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        wateringSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, wateringManageService.save(wateringSaveParam));
    }

    /**
     * 浇水记录删除
     *
     * @param recordId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String recordId) {
        wateringManageService.del(recordId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
