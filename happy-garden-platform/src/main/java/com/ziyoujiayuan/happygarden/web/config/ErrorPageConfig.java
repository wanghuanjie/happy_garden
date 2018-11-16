package com.ziyoujiayuan.happygarden.web.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 错误页面处理
 *
 * @author wanghjbuf
 * @date 2018/10/24
 */
@Configuration
public class ErrorPageConfig implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/403");
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500");

        container.addErrorPages(error401Page, error404Page, error500Page);
    }
}