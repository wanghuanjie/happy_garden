package com.ziyoujiayuan.happygarden;

import com.hbxhx.runtime.core.spring.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 入口函数
 *
 * @author wanghjbuf
 * @date 2018/10/24
 */
@Slf4j
@SpringBootApplication
@ComponentScan(basePackages={"com.ziyoujiayuan.happygarden"})
public class App {

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }

    public static void main(String[] args) {
        log.info("SpringBootApplication->{start};");
        SpringApplication.run(App.class, args);
    }
}