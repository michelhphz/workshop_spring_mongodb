package com.spring_mongodb.spring_mongodb.repositories;

import java.util.List;

import com.spring_mongodb.spring_mongodb.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
    List<Post> findByTitleContainingIgnoreCase(String text);
}