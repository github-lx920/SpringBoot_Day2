package com.baizhi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//切面类
@Aspect  //注明该类为切面类
@Component   //把切面类交由Spring工厂管理
@Order(99)
public class MyAspect {

    //前置通知注解
    @Before("execution(* com.baizhi.service..*.register(String,..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("我是运行在原始方法之前执行的额外功能");
    }

}
