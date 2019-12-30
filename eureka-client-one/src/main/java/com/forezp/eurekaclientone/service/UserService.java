package com.forezp.eurekaclientone.service;

import com.forezp.eurekaclientone.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser(int pageNum, int pageSize, int userId);
}
