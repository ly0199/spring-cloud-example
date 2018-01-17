package com.lijq.cloud.feign.controller;

import com.lijq.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lijq 2018/1/17
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/eureka-client-get")
    public String get(@RequestParam(value = "name", defaultValue = "访客") String name) {
        return feignService.get(name);
    }


}
