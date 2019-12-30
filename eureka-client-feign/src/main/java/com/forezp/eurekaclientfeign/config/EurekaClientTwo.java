package com.forezp.eurekaclientfeign.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-two",configuration = FeignConfig.class,fallback = hiErrorTwo.class)
public interface EurekaClientTwo {

    @RequestMapping(value = "/getHi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
