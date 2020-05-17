package com.example.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private UUID Id;
    private String name;
    private String surname;

    public User(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("surname") String surname) {
        Id = id;
        this.name = name;
        this.surname = surname;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
