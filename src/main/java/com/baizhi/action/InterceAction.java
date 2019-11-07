package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Interceptor")
public class InterceAction {

    @RequestMapping("/A")
    public String A() throws Exception {
        System.out.println("我是A方法");
        return "index";
    }

    @RequestMapping("/B")
    public String B() throws Exception {
        System.out.println("我是B方法");
        return "index";
    }

    @RequestMapping("/C")
    public String C() throws Exception {
        System.out.println("我是C方法");
        return "index";
    }
}
