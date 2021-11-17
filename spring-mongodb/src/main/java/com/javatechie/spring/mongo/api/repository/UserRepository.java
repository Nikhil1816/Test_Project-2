package com.javatechie.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javatechie.spring.mongo.api.entity.User;

public interface UserRepository extends MongoRepository<User,Long> {

}
