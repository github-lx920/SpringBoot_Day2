package com.baizhi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AopServiceIpml implements AopService {
    @Override
    public void register() {
        System.out.println("我是注册方法");
    }

    @Override
    public void register(String username, String password) {
        System.out.println("我是带有两参的注册方法");
    }

    @Override
    public void delete(String id) {
        System.out.println("我是删除方法");
    }
}
