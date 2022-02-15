package com.tzxx.consumer.controller;

import com.tzxx.consumer.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private FeignService feignService;

    @GetMapping("/feign/echo/{str}")
    public String feign(@PathVariable String str) {
        return feignService.echo(str);
    }

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "consumer reply: " + string;
    }

    @GetMapping(value = "hello")
    public String hello() {
        return "hello. i am consumer";
    }
}
