package com.example.springbootapijwt.service;

import com.example.springbootapijwt.authen.UserPrincipal;
import com.example.springbootapijwt.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
