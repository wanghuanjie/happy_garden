package com.ziyoujiayuan.happygarden;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 入口函数
 *
 * @author wanghjbuf
 * @date 2018/10/24
 */
@Slf4j
@ComponentScan(basePackages={"com.ziyoujiayuan.happygarden"})
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        log.info("SpringBootApplication->{start};");
        SpringApplication.run(App.class, args);
    }
}