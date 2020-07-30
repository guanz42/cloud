package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class UserController {

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping(value = "/api/config", method = RequestMethod.GET)
    String getConfigInfo() {
        System.out.println(configInfo);
        return configInfo;
    }
}
