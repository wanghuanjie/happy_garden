package com.ziyoujiayuan.happygarden.web.exception;

import com.hbxhx.runtime.web.exception.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常处理
 *
 * @author wanghjbuf
 * @date 2018/11/15
 */
@ControllerAdvice
public class DefExceptionHandler extends GlobalExceptionHandler{

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object execute(HttpServletRequest request, Exception e) throws Exception{
        return super.jsonErrorHandler(request, e);
    }
}
