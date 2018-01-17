package com.lijq.cloud.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lijq 2017/12/25
 */
@RestController
public class EurekaController {


    @GetMapping(value = "/get")
    public String get(@RequestParam(value = "name", defaultValue = "访客") String name) {

        return String.format("Hi %s, nice to meet you ! You can visit me E-mail: ly_0199@163.com", name);
    }
}
