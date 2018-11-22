package com.ziyoujiayuan.happygarden.web.controller.flower;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.FlowerQueryParam;
import com.ziyoujiayuan.happygarden.param.FlowerSaveParam;
import com.ziyoujiayuan.happygarden.service.FlowerService;
import com.ziyoujiayuan.happygarden.web.sso.OnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 绿植管理
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/flowerManage")
public class FlowerManageController extends BaseController {

    @Resource
    private FlowerService flowerService;

    /**
     * 绿植查询
     *
     * @param flowerQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(FlowerQueryParam flowerQueryParam) {
        flowerQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, flowerService.query(flowerQueryParam), flowerQueryParam.getDraw());
    }

    /**
     * 绿植保存
     *
     * @param flowerSaveParam
     * @return
     */
    @RequestMapping("/save.action")
    @ResponseBody
    public AjaxResult save(FlowerSaveParam flowerSaveParam) {
        flowerSaveParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        flowerSaveParam.setRegenerator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, flowerService.save(flowerSaveParam));
    }

    /**
     * 绿植删除
     *
     * @param flowerId
     * @return
     */
    @RequestMapping("/del.action")
    @ResponseBody
    public AjaxResult del(String flowerId) {
        flowerService.del(flowerId);
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, null);
    }

    /**
     * 绿植下拉选
     *
     * @return
     */
    @RequestMapping("/pubsel.action")
    @ResponseBody
    public AjaxResult pubsel(FlowerQueryParam flowerQueryParam) {
        flowerQueryParam.setCreator(OnlineUser.current().getUserBasicInfo().getUserId());
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, flowerService.queryPub(flowerQueryParam));
    }
}
