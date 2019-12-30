package com.forezp.eurekaclienttwo.controller;

import com.forezp.eurekaclienttwo.model.User;
import com.forezp.eurekaclienttwo.service.UserService;
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
    public List<User> findUserById(int start, int limit, String phone){
        List<User> allUser = userService.findAllUser(start, limit, phone);
        return allUser;
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public String insertUser(){
        User user = new User();
        user.setName("李四");
        user.setPassword("123456");
        user.setPhone("78787878787");
        int i = userService.insertUser(user);
        return String.valueOf(i);
    }
}
