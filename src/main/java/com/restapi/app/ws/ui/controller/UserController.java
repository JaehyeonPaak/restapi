package com.restapi.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser() {
        return "Get user was called";
    }

    @PostMapping
    public String createUser() {
        return "Create user was called";
    }

    @PutMapping
    public String updateUser() {
        return "Update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete user was called";
    }
}
