package com.forezp.eurekaclientfeign.config;

import org.springframework.stereotype.Component;

@Component
public class hiError implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",error!Sorry!";
    }
}
