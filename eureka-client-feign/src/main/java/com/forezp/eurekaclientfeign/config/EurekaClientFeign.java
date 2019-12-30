package com.forezp.eurekaclientfeign.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-one",configuration = FeignConfig.class,fallback = hiError.class)
public interface EurekaClientFeign {

    @RequestMapping(value = "/getHi")
    String sayHiFromClientEureka(@RequestParam(value = "name")String name);
}
