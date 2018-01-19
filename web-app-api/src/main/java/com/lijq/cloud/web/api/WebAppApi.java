package com.lijq.cloud.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lijq 2018/1/19
 */
@RequestMapping(name = "/api")
public interface WebAppApi {

    @GetMapping(value = "/get")
    public String get(@RequestParam(name = "name", defaultValue = "访客") String name);

}
