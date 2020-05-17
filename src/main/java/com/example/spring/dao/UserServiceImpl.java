package com.example.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;
import com.example.spring.model.User;
import org.springframework.cache.annotation.Cacheable;


public class UserServiceImpl implements UserService {
    private  final FakeRepo fakeRepo;
    private final User user;
    @Autowired

    public UserServiceImpl(FakeRepo fakeRepo, User user) {
        this.fakeRepo = fakeRepo;
        this.user = user;
    }

    @Override
    public String addUser(UUID id, String name, String surname) {
         name = user.getName();
        return "Hello "+ name;

    }

    @Override
    public String removeUser(UUID Id) {
        fakeRepo.deleteUser(Id);
        String name = user.getName();
        return name +" removed";
    }

    @Override

    public String getUser(UUID Id) {

        //User user = userServiceImpl.findUserById(id);
        String name = user.getName();

        return "Hello "+ name;
    }
}
