package com.kobe.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionAdvice {
    /**
     * 全局异常捕捉处理
     * @param
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Throwable.class)
    public Map errorHandler(Exception e) {
        Map map = new HashMap();
        map.put("code", 500);
        map.put("message", e.getMessage());
        e.printStackTrace();
        //map.put("data",e);
        return map;
    }
}
