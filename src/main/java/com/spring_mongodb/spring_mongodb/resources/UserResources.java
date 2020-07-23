package com.spring_mongodb.spring_mongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.spring_mongodb.spring_mongodb.domain.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public List<User> findAll() {
        final User maria = new User("1", "Maria Brown", "maria@gmail.com");
        final User alex = new User("2", "Alex Green", "alex@gmail.com");
        final List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return list;
    }
}