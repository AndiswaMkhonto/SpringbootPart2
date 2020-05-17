package com.example.spring.dao;

import com.example.spring.model.User;

import java.util.Optional;
import java.util.UUID;

public interface FakeRepoInterface {
    int insertUser(UUID id, User user);
    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id,user);
    }


    Optional<User> findUserById(UUID id);

    int deleteUser(UUID id);




}
