package com.ziyoujiayuan.happygarden.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wanghjbuf
 * @date 2018/10/26
 */
@Slf4j
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/index")
    @ResponseBody
    public String index() throws Exception {
        return "index";
    }
}
