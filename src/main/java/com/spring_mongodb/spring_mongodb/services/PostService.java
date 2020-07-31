package com.spring_mongodb.spring_mongodb.services;

import java.util.List;
import java.util.Optional;

import com.spring_mongodb.spring_mongodb.domain.Post;
import com.spring_mongodb.spring_mongodb.repositories.PostRepository;
import com.spring_mongodb.spring_mongodb.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }    

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
}