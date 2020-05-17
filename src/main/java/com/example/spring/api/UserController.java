package com.example.spring.api;

import com.example.spring.model.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping(path="{id}")
    public User findUserById(@PathVariable("id") UUID id){
        return userService.findPersonById(id)
                .orElse(null);
    }
    @DeleteMapping(path="{id}")
    public void deleteUserByID(@PathVariable("id") UUID id){
        userService.deleteUser(id);
    }
    @PostMapping
    public void addUsers(@RequestBody User user){
        userService.addUser(user);
    }
    @DeleteMapping
    public void removeUser(@PathVariable("id") UUID id){
        userService.removeUser(id);
    }
    @GetMapping
    public void getUsers(@PathVariable("id") UUID id){
        userService.getUser(id);
    }
}
