package com.spring_mongodb.spring_mongodb.services;

import java.util.List;
import java.util.Optional;

import com.spring_mongodb.spring_mongodb.domain.User;
import com.spring_mongodb.spring_mongodb.dto.UserDTO;
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

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}