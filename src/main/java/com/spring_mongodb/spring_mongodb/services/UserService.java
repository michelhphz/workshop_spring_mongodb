package com.spring_mongodb.spring_mongodb.services;

import java.util.List;
import java.util.Optional;

import com.spring_mongodb.spring_mongodb.domain.User;
import com.spring_mongodb.spring_mongodb.repositories.UserRepository;
import com.spring_mongodb.spring_mongodb.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}