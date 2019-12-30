package com.forezp.eurekaclientfeign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        //设置重试机制，重试间隔为100ms，最大重试时间为1s,重试次数为5次。
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
