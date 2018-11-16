package com.ziyoujiayuan.happygarden.web.controller.remind;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import com.ziyoujiayuan.happygarden.param.RemindSaveParam;
import com.ziyoujiayuan.happygarden.service.RemindService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 提醒管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/remind")
public class RemindController extends BaseController {

    @Resource
    private RemindService remindService;

    /**
     * 提醒查询
     *
     * @param remindQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(RemindQueryParam remindQueryParam) {
        remindQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, remindService.query(remindQueryParam), remindQueryParam.getDraw());
    }

    /**
     * 施肥提醒保存
     *
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(RemindSaveParam remindSaveParam) {
        remindSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        remindSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, remindService.save(remindSaveParam));
    }

    /**
     * 施肥提醒删除
     *
     * @param recordId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String recordId) {
        remindService.del(recordId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }
}
