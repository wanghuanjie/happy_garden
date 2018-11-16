package com.ziyoujiayuan.happygarden.web.controller.hall;

import com.hbxhx.runtime.base.result.AjaxTableResult;
import com.hbxhx.runtime.web.BaseController;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import com.ziyoujiayuan.happygarden.param.HallQueryParam;
import com.ziyoujiayuan.happygarden.service.HallService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 大厅
 *
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Controller
@RequestMapping(value = "/hall")
public class HallController extends BaseController {

    @Resource
    private HallService hallService;

    /**
     * 大厅查询
     *
     * @param hallQueryParam
     * @return
     */
    @RequestMapping("/query.action")
    @ResponseBody
    public AjaxTableResult query(HallQueryParam hallQueryParam) {
        return new AjaxTableResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, hallService.query(hallQueryParam), hallQueryParam.getDraw());
    }
}
