package com.example.spring.service;

import com.example.spring.dao.FakeRepoInterface;
import com.example.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
public class UserService {
    private  final FakeRepoInterface fakeRepoInterface;
    private final UserService userService;
     @Autowired
    public UserService(@Qualifier("fakeDao") FakeRepoInterface fakeRepoInterface, UserService userService) {
        this.fakeRepoInterface = fakeRepoInterface;
         this.userService = userService;
     }
    public int addUser(User user){
        return fakeRepoInterface.insertUser(user);
    }
    public Optional<User> findPersonById(UUID id){
         return fakeRepoInterface.findUserById(id);
    }
    public int deleteUser(UUID id){
         return fakeRepoInterface.deleteUser(id);
    }
    public int addUsers(User user){
         return userService.addUser(user);
    }
    public int removeUser(UUID id){
         return userService.removeUser(id);
    }
    @Cacheable("name")
    public int getUser(UUID id){

        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

         return userService.getUser(id);
    }

}
