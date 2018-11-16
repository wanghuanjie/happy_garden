package com.ziyoujiayuan.happygarden.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghjbuf
 * @date 2018/10/28
 */
@RestController
public class CommonController {

    @RequestMapping("/404")
    public String page404() {
        return "404";
    }

    @RequestMapping("/403")
    public String page403() {
        return "403";
    }

    @RequestMapping("/500")
    public String page500() {
        return "500";
    }
}
