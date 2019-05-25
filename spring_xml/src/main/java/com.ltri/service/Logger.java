package com.ltri.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * create by com.ltri on 2019/05/25 18:34
 */
public interface Logger {
    //aop before方法，前置通知
    void before();
    //aop afterReturning方法，后置通知
    void afterReturning();
    //aop afterThrowing方法，异常通知
    void afterThrowing();
    //aop after方法，最终通知
    void after();
    //aop around方法，环绕通知
    Object around(ProceedingJoinPoint proceedingJoinPoint);

}
