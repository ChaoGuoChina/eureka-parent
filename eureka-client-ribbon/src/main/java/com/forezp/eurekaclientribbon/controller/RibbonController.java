package com.forezp.eurekaclientribbon.controller;

import com.forezp.eurekaclientribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/getHi",method = RequestMethod.GET)
    public String getHi(String name){
        return ribbonService.getHi(name);
    }

}
