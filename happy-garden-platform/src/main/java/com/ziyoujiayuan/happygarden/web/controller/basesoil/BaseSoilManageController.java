package com.ziyoujiayuan.happygarden.web.controller.basesoil;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.BaseSoilQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseSoilSaveParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基础土壤管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/baseSoilManage")
public class BaseSoilManageController extends BaseController{

    /**
     * 基础土壤查询
     *
     * @param baseSoilQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(BaseSoilQueryParam baseSoilQueryParam) {
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null, baseSoilQueryParam.getDraw());
    }

    /**
     * 基础土壤保存
     *
     * @param baseSoilSaveParam
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(BaseSoilSaveParam baseSoilSaveParam) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 基础土壤删除
     *
     * @param soilId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String soilId) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 基础土壤下拉选
     *
     * @return
     */
    @RequestMapping("/pubsel.action")
    @ResponseBody
    public AjaxResult pubsel() {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
