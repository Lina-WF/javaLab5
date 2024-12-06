package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserEntity getUser(int id) {
        UserEntity entity = userRepository.findById(id).orElse(null);
        System.out.println(entity);
        return entity;
    }

    @Override
    public void addUser(UserRequest userRequest) {
        UserEntity user = new UserEntity();
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setJob(userRequest.getJob());
        userRepository.save(user);
    }
}