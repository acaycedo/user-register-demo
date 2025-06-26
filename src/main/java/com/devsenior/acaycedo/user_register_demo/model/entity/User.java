package com.devsenior.acaycedo.user_register_demo.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @Column(length = 20)
    private String userName;

    @Column(nullable = false, length = 32)
    private String password;
    @Column(nullable = false, length = 100)
    private String firstName;
    @Column(nullable = false, length = 100)
    private String lastName;
    @Column(nullable = false, length = 150, unique = true  )
    private String email;

    @Column(length = 15)
    private String city;
    @Column(length = 100)
    private String phoneNumber;

    @Column(nullable = false)
    private LocalDateTime hireDate;

}
