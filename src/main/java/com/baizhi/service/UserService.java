package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //注册
    void insert(User user);

    //修改
    void update(User user);

    //删除
    void delete(String id);

    //查询所有
    List<User> selectAll(Integer page, Integer rows);

    //获取总条数
    Integer totalcount();

}
