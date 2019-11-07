package com.baizhi.service;

public interface AopService {
    void register();

    void register(String username, String password);

    void delete(String id);

}
