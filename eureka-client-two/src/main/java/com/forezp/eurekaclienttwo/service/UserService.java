package com.forezp.eurekaclienttwo.service;

import com.forezp.eurekaclienttwo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser(int pageNum, int pageSize, String phone);

    int insertUser(User user);
}
