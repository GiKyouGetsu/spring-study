package com.wei.service.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAspect {

    @Before("execution(* com.wei.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=============== before ==============");
    }


    @After("execution(* com.wei.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=============== after ==============");
    }

    @Around("execution(* com.wei.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        joinPoint.proceed();
        System.out.println("环绕后");
    }
}
