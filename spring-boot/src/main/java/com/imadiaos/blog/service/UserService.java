package com.imadiaos.blog.service;

import com.imadiaos.blog.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void register(String username, String password);

    UserEntity findUser(String username);

    UserEntity login(String username, String password);
}
