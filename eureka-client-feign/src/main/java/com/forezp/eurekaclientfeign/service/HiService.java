package com.forezp.eurekaclientfeign.service;

import com.forezp.eurekaclientfeign.config.EurekaClientFeign;
import com.forezp.eurekaclientfeign.config.EurekaClientTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @Autowired
    EurekaClientTwo eurekaClientTwo;

    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }

    public String sayHiTwo(String name){
        return eurekaClientTwo.sayHiFromClientEureka(name);
    }

}
