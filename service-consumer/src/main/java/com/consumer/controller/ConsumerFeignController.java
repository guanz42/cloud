package com.consumer.controller;

import com.consumer.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {

    private final UserFeignService userFeignService;

    @Autowired
    public ConsumerFeignController(UserFeignService userFeignService) {
        this.userFeignService = userFeignService;
    }

    @RequestMapping(value = "/consumer/feign/user/{id}", method = RequestMethod.GET)
    String getUserByID(@PathVariable Integer id) {
        return userFeignService.getUserByID(id);
    }
}
