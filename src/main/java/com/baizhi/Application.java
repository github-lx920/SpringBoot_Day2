package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication  //开启springboot应用
@MapperScan("com.baizhi.dao") //自动创建dao类实现对象
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        //启动SpringBoot应用
        SpringApplication.run(Application.class, args);
    }

    //告知外部的tomcat   加载该入口类
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
