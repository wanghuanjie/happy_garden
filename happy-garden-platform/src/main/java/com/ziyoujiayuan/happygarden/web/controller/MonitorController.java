package com.ziyoujiayuan.happygarden.web.controller;

import com.hbxhx.runtime.base.result.AjaxResult;
import com.ziyoujiayuan.happygarden.enums.AjaxResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 监控controller
 *
 * @author wanghjbuf
 * @date 2018/9/3
 */
@Slf4j
@Controller
@RequestMapping("/monitor")
public class MonitorController {

    /**
     * 应用监控接口
     *
     * @return
     */
    @RequestMapping("/index")
    @ResponseBody
    public AjaxResult execute(){
        return new AjaxResult(AjaxResultEnum.SUCCESS.getCode(), AjaxResultEnum.SUCCESS.getMessage(), true, "success");
    }
}
