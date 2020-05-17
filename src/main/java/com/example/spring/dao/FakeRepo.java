package com.example.spring.dao;

import com.example.spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("fakeDao")

public class FakeRepo implements FakeRepoInterface {
    private static List<User> DB  = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id,user.getName(),user.getSurname()));
        return 1;
    }


    @Override
    public Optional<User> findUserById(UUID id) {
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteUser(UUID id) {
        Optional<User> userMyabe = findUserById(id);
        if(userMyabe.isEmpty()){
            return 0;
        }
        DB.remove(userMyabe.get());
        return 1;
    }
}
