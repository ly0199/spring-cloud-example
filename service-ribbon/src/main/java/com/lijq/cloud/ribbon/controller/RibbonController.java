package com.lijq.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    //@RequestMapping(value = "/get", method = RequestMethod.GET)
    @GetMapping(value = "/get")
    public String get(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/get?name=" + name, String.class);
    }
}
