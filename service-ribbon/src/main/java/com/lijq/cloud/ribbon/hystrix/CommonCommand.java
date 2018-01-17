package com.lijq.cloud.ribbon.hystrix;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lijq 2018/1/17
 */
public class CommonCommand extends HystrixCommand {

    private RestTemplate restTemplate;
    private Long id;

    public CommonCommand(Setter setter, RestTemplate restTemplate, Long id) {
        super(setter);
        this.restTemplate = restTemplate;
        this.id = id;
    }

    @Override
    protected Object run() throws Exception {
        return restTemplate.getForObject("http://EUREKA-CLIENT/get?name=" + "hystrix", String.class);
    }

    @Override
    protected Object getFallback() {
        return "hystrix : fallback";
    }
}
