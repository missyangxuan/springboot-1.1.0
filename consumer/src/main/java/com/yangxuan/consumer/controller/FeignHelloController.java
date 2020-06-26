package com.yangxuan.consumer.controller;

import com.yangxuan.consumer.service.MangoProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignHelloController {

    @Resource
    private MangoProducerService mangoProducerService;
    @RequestMapping("/feign/call")
    public String call() {
        // 像调用本地服务一样
        return mangoProducerService.hello();
    }

}
