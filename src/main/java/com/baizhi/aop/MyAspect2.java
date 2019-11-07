package com.baizhi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyAspect2 {

    //前置通知的注解
    @Before("execution(* com.baizhi.service.*.*(String,..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("我是在执行原始方法之前执行的额外功能");
       /* //获取原始对象
        Object target = joinPoint.getTarget();
        System.out.println("输出原始对象的类型："+target.getClass());
        //获取原始对象的方法名
        Signature signature = joinPoint.getSignature();
        System.out.println("原始对象方法名:  "+signature);
        //获取传入给原始方法的实际参数
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }*/
    }

    /* //后置通知的注解
     @After("execution(* com.baizhi.service.*.*(..))")
     public void after(JoinPoint joinPoint){
         System.out.println("我是在执行原始方法之后执行的额外功能");
        *//* //获取原始对象
        Object target = joinPoint.getTarget();
        System.out.println("输出 原始对象的类型："+target.getClass());
        //获取原始对象的方法名
        Signature signature = joinPoint.getSignature();
        System.out.println("原始对象的方法名："+signature);
        //获取传入给原始方法的实际参数
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("传入进来的参数："+arg);
        }*//*
    }

    //环绕通知的注解
    @Around("execution(* com.baizhi.service..*.*(String,String))")
    public void arount(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("我是在执行原始方法执行前后 执行的额外功能");
       *//* //获取原始对象
        Object target = proceedingJoinPoint.getTarget();
        System.out.println("输出原始对象的类型："+target.getClass());
        //获取原始对象的方法名
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println("原始对象的方法名："+signature);
        //获取传入给原始方法的实际参数
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("传入的参数："+arg);
        }*//*
    }
*/
    //异常通知的注解
    @AfterThrowing("execution(* com.baizhi.service..*.*(..))")
    public void exection() {
        System.out.println("我是产生异常时执行的方法");
    }
}
