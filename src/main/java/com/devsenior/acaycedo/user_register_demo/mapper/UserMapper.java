package com.devsenior.acaycedo.user_register_demo.mapper;

import org.springframework.stereotype.Component;

import com.devsenior.acaycedo.user_register_demo.model.dto.UserRegisterRequest;
import com.devsenior.acaycedo.user_register_demo.model.entity.User;

@Component
public class UserMapper {
    public User userRegisterRequesToUser(UserRegisterRequest user){
        var response = new User();
        response.setUserName(user.getUserName());
        response.setPassword(user.getPassword());
        response.setFirstName(user.getFirtName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhoneNumber(user.getPhoneNumber());
        response.setCity(user.getCity());
        return response;
    }
}
