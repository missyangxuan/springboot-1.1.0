package com.yangxuan.consumer.controller;

import com.yangxuan.consumer.service.MangoProducerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class MangoProducerHystrix implements MangoProducerService {

    @RequestMapping("/hello")
    public String hello() {
        return "sorry, hello service call failed.";
    }
}
