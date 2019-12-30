package com.forezp.eurekaclientfeign.controller;

import com.forezp.eurekaclientfeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @RequestMapping(value = "/getHi",method = RequestMethod.GET)
    public String getHi(@RequestParam(value = "name")String name){
        return hiService.sayHi(name);
    }

    @RequestMapping(value = "/getHiTwo",method = RequestMethod.GET)
    public String getHiTwo(@RequestParam(value = "name")String name){
        return hiService.sayHiTwo(name);
    }
}
