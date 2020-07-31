package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @GetMapping(value = "/sentinel/service/A")
    @SentinelResource(value = "serviceA", fallback = "service A flow control")
    String getServiceA() {
        System.out.println("service A called");
        return "service A called";
    }

    @GetMapping(value = "/sentinel/service/B")
    @SentinelResource(value = "serviceB", fallback = "service B flow control")
    String getServiceB() {
        System.out.println("service B called");
        return "service B called";
    }
}
