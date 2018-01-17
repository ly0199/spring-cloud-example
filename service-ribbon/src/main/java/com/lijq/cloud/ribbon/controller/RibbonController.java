package com.lijq.cloud.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lijq 2017/12/25
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 根据name查询
     *
     * @param name name
     * @return String
     */
    @GetMapping(value = "/get")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    //@HystrixCommand
    public String get(@RequestParam(value = "name", defaultValue = "访客") String name) {
        //return restTemplate.getForEntity("http://EUREKA-CLIENT/get?name=" + name, Object.class, "lijq");
        return restTemplate.getForObject("http://EUREKA-CLIENT/get?name=" + name, String.class);
    }

    public String fallbackMethod(String name) {
        return "==== >>>>> ERROR " + name + " <<<<< ====";
    }
}
