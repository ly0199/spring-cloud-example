package com.lijq.cloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lijq 2018/1/17
 */
@FeignClient("eureka-client")
public interface FeignService {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(@RequestParam(name = "name") String name);
}
