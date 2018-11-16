package com.ziyoujiayuan.happygarden.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghjbuf
 * @date 2018/10/28
 */
@RequestMapping("/docker")
@RestController
public class DockerController {

    /**
     * hello docker
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello-Docker!";
    }
}
