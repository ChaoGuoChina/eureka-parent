package com.forezp.eurekaclienttwo.service.impl;

import com.forezp.eurekaclienttwo.mapper.UserMapper;
import com.forezp.eurekaclienttwo.model.User;
import com.forezp.eurekaclienttwo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser(int pageNum, int pageSize,String phone) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        User user = userMapper.findUserByPhone(phone);
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

    @Override
    public int insertUser(User user) {
        int num = userMapper.insert(user.getPhone(), user.getPassword(), user.getName());
        return num;
    }
}
