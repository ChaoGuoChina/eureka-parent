package com.forezp.eurekaclientone.service.impl;

import com.forezp.eurekaclientone.mapper.UserMapper;
import com.forezp.eurekaclientone.model.User;
import com.forezp.eurekaclientone.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser(int pageNum, int pageSize,int userId) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        User user = userMapper.selectByPrimaryKey(userId);
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
