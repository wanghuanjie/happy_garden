package com.ziyoujiayuan.happygarden.controller.basefertilizer;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.BaseFertilizerQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseFertilizerSaveParam;
import com.ziyoujiayuan.happygarden.param.BaseFlowerQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseFlowerSaveParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基础肥料管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/baseFertilizerManage")
public class BaseFertilizerManageController extends BaseController {

    /**
     * 基础肥料查询
     *
     * @param baseFertilizerQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(BaseFertilizerQueryParam baseFertilizerQueryParam) {
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null, baseFertilizerQueryParam.getDraw());
    }

    /**
     * 基础肥料保存
     *
     * @param baseFertilizerSaveParam
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(BaseFertilizerSaveParam baseFertilizerSaveParam) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 基础肥料删除
     *
     * @param baseFertilizerId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String baseFertilizerId) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 基础肥料下拉选
     *
     * @return
     */
    @RequestMapping("/pubsel.action")
    @ResponseBody
    public AjaxResult pubsel() {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
