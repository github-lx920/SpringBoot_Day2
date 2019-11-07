package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void insert(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.insert(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public List<User> selectAll(Integer page, Integer rows) {
        List<User> users = userDao.selectAll(page, rows);
        return users;
    }

    @Override
    public Integer totalcount() {
        Integer totalcount = userDao.totalcount();
        return totalcount;
    }

}
