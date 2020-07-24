package com.spring_mongodb.spring_mongodb.repositories;

import com.spring_mongodb.spring_mongodb.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}