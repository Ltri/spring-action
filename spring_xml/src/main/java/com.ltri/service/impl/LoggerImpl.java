package com.ltri.service.impl;

import com.ltri.service.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * create by com.ltri on 2019/05/25 18:36
 */

public class LoggerImpl implements Logger {
    @Override
    public void before() {
        System.out.println("模拟aop，切入点执行前before方法");
    }


    @Override
    public void afterReturning() {
        System.out.println("模拟aop，切入点执行after-returning方法");
    }

    @Override
    public void afterThrowing() {
        System.out.println("模拟aop，切入点执行after-throwing方法");
    }

    @Override
    public void after() {
        System.out.println("模拟aop，切入点执行后after方法");
    }

    @Override
    //环绕通知即通过代码方式配置
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            Object[] args = proceedingJoinPoint.getArgs();
            System.out.println("前置通知");
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
