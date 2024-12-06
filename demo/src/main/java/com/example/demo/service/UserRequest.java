package com.example.demo.service;

import lombok.Data;

@Data
public class UserRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String job;

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJob() {
        return job;
    }
}
