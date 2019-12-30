package com.forezp.eurekaclienttwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/getHi",method = RequestMethod.GET)
    public String getHi(String name){
        return "hi "+name+",my port:" + port;
    }
}
