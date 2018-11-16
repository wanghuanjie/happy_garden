package com.ziyoujiayuan.happygarden.web.controller.feedback;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.FeedbackQueryParam;
import com.ziyoujiayuan.happygarden.param.FeedbackSaveParam;
import com.ziyoujiayuan.happygarden.service.FeedbackService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 反馈管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/feedbackManage")
public class FeedbackManageController extends BaseController {

    @Resource
    private FeedbackService feedbackService;

    /**
     * 反馈查询
     *
     * @param feedbackQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(FeedbackQueryParam feedbackQueryParam) {
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null, feedbackQueryParam.getDraw());
    }

    /**
     * 反馈保存
     *
     * @param feedbackSaveParam
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(FeedbackSaveParam feedbackSaveParam) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, feedbackService.save(feedbackSaveParam));
    }

    /**
     * 反馈删除
     *
     * @param feedbackId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String feedbackId) {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 反馈下拉选
     *
     * @return
     */
    @RequestMapping("/pubsel.action")
    @ResponseBody
    public AjaxResult pubsel() {
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
