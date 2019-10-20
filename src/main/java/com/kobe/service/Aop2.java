package com.kobe.service;

import com.alibaba.fastjson.JSON;
import com.kobe.annotation.DaoCache;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Aspect
@Component
@Order(2)
@Log4j2
public class Aop2 {
    // 公用的切点，该类下所有方法
    @Pointcut("execution(* com.kobe..*.*(..))")
    public void log() {

    }

    // 使用log函数定义的 execution，不执行log()方法
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("切mybatis");
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
            Signature signature = proceedingJoinPoint.getSignature();

            if (!(signature instanceof MethodSignature)){
                throw new Exception();
            }
            MethodSignature methodSignature = (MethodSignature) signature;
            Object target = proceedingJoinPoint.getTarget();
            //Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
            Method method=target.getClass().getMethod(methodSignature.getName(),methodSignature.getParameterTypes());
            Method accessibleMethod = MethodUtils.getAccessibleMethod(proceedingJoinPoint.getTarget().getClass(), methodSignature.getName(), proceedingJoinPoint.getArgs().getClass());
            DaoCache annotation = method.getAnnotation(DaoCache.class);
            DaoCache annotation1 = method.getClass().getAnnotation(DaoCache.class);

            DaoCache annotation3 = method.getAnnotation(DaoCache.class);

            Signature s = proceedingJoinPoint.getSignature();
            MethodSignature ms = (MethodSignature)s;
            Method m = ms.getMethod();

            DaoCache annotation2 = m.getAnnotation(DaoCache.class);

            Transactional annotation4 = m.getAnnotation(Transactional.class);

            Object obj = proceedingJoinPoint.proceed();

            return obj;
        } catch (Throwable throwable) {
            return null;
        }

    }
}
