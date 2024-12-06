package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserRequest;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<UserEntity> getUser(@RequestParam int id) {
        System.out.println(id);
        return ResponseEntity.ok().body(userService.getUser(id));
    }

    @PostMapping
    public void addUser(@RequestBody UserRequest userRequest) {
        userService.addUser(userRequest);
    }
}
