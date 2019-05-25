package com.ltri.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

/**
 * create by com.ltri on 2019/05/25 18:34
 */
@Service
public interface Logger {
    //aop before方法，前置通知
    void before();

    //aop afterReturning方法，后置通知
    void afterReturning();

    //aop afterThrowing方法，异常通知
    void afterThrowing();

    //aop after方法，
    void after();

    //aop around方法，环绕通知
    Object around(ProceedingJoinPoint proceedingJoinPoint);

}
