package com.example.springbootapijwt.service;

import com.example.springbootapijwt.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
