package com.ziyoujiayuan.happygarden.web.controller.cultivate;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerSaveParam;
import com.ziyoujiayuan.happygarden.service.ApplyFertilizerManageService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 施肥记录管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/applyFertilizerManage")
public class ApplyFertilizerManageController extends BaseController {

    @Resource
    private ApplyFertilizerManageService applyFertilizerManageService;

    /**
     * 施肥记录查询
     *
     * @param applyFertilizerQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(ApplyFertilizerQueryParam applyFertilizerQueryParam) {
        applyFertilizerQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, applyFertilizerManageService.query(applyFertilizerQueryParam), applyFertilizerQueryParam.getDraw());
    }

    /**
     * 施肥记录保存
     *
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(ApplyFertilizerSaveParam applyFertilizerSaveParam) {
        applyFertilizerSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        applyFertilizerSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, applyFertilizerManageService.save(applyFertilizerSaveParam));
    }

    /**
     * 施肥记录删除
     *
     * @param recordId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String recordId) {

        applyFertilizerManageService.del(recordId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
