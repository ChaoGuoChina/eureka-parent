package com.forezp.eurekaclientone.controller;

import com.forezp.eurekaclientone.model.User;
import com.forezp.eurekaclientone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/userId")
    @ResponseBody
    public List<User> findUserById(int start,int limit,int id){
        List<User> allUser = userService.findAllUser(start, limit, id);
        return allUser;
    }
}
