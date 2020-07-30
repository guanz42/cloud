package com.user.service.impl;

import com.user.entity.User;
import org.springframework.stereotype.Service;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByID(int id) {
        return new User(id, "hello, " + id);
    }
}
