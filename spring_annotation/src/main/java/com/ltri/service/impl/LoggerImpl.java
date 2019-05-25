package com.ltri.service.impl;

import com.ltri.service.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * create by com.ltri on 2019/05/25 18:36
 */
@Service
@Aspect
public class LoggerImpl implements Logger {
    @Pointcut("execution(* com.ltri.service.impl.*.*(..))")
    private void pointCut(){}

//    @Before("pointCut()")
    public void before() {
        System.out.println("模拟aop，切入点执行前before方法");
    }
//    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("模拟aop，切入点执行after-returning方法");
    }

//    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("模拟aop，切入点执行after-throwing方法");
    }

//    @After("pointCut()")
    public void after() {
        System.out.println("模拟aop，切入点执行后after方法");
    }

    @Around("pointCut()")
    //环绕通知即通过代码方式配置
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            Object[] args = proceedingJoinPoint.getArgs();
            System.out.println("前置的通知");
            Object proceed = proceedingJoinPoint.proceed(args);
            System.out.println("后置通知");
            return proceed;
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        }
        finally {
            System.out.println("最终通知");
        }
        return null;
    }
}
