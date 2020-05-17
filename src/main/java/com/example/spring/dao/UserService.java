package com.example.spring.dao;

import java.util.UUID;

public interface UserService {

    public String addUser(UUID id, String name, String surname);

    public String removeUser(UUID Id);

    public String getUser(UUID Id);
}
