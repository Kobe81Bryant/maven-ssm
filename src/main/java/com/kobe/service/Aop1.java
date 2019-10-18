package com.kobe.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Order(10000)
@Log4j2
public class Aop1 {
    // 公用的切点，该类下所有方法
    @Pointcut("execution(* com.kobe..*(..))")
    public void log() {

    }

    // 使用log函数定义的 execution，不执行log()方法
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("调用 doBefore");
        //ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        log.info("获取 request");
        //HttpServletRequest request = attributes.getRequest();
        log.info("获取 reponse");
        //attributes.getResponse();
        log.info("获取 session");
        //attributes.getRequest().getSession();
        log.info("获取 class:" + joinPoint.getSignature().getDeclaringTypeName().toString());
        log.info("获取 args:" + joinPoint.getArgs());
    }

    // 获取返回值
    @AfterReturning(pointcut = "log()", returning = "object")
    public void doAfterReturning(Object object) {
        log.info("获取返回值" + JSON.toJSONString(object));
    }


    @Around(value = "log()")
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        log.info("环绕通知的目标方法名：" + proceedingJoinPoint.getSignature().getName());
        try {
            Object obj = proceedingJoinPoint.proceed();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }

    }
}
