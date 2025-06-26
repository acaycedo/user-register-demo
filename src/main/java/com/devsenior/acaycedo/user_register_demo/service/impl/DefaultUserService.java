package com.devsenior.acaycedo.user_register_demo.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.devsenior.acaycedo.user_register_demo.mapper.UserMapper;
import com.devsenior.acaycedo.user_register_demo.model.dto.UserRegisterRequest;
import com.devsenior.acaycedo.user_register_demo.repository.UserRepository;
import com.devsenior.acaycedo.user_register_demo.service.UserRegisterService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DefaultUserService implements UserRegisterService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public void register(UserRegisterRequest user){
        var entity = userMapper.userRegisterRequesToUser(user);
        entity.setHireDate(LocalDateTime.now());

        userRepository.save(entity);


    }
}
