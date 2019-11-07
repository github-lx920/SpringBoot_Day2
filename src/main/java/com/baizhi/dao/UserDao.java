package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    //添加
    void insert(User user);

    //修改
    void update(User user);

    //删除
    void delete(String id);

    //查询所有   当前页        每页展示的数据
    List<User> selectAll(@Param("page") Integer page, @Param("rows") Integer rows);

    //获取总条数
    Integer totalcount();
}
