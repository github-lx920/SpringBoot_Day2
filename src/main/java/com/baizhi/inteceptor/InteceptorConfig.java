package com.baizhi.inteceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component  //把拦截器注册中心交有Spring工厂管理
public class InteceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private MyIntceptor myIntceptor;//获取自定义拦截器


    //注册拦截器  并配置拦截器规则
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //把自定义的拦截器注册到注册中心        拦截哪些路径          不拦截哪些路径
        registry.addInterceptor(myIntceptor).addPathPatterns("/Interceptor/**").excludePathPatterns("/Interceptor/A");
    }
}
