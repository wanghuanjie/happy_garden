package com.ziyoujiayuan.happygarden.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wanghjbuf
 * @date 2018/10/26
 */
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/index")
    public ModelAndView index() throws Exception {
        return new ModelAndView("/index");
    }
}
