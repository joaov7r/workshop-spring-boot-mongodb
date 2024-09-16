package com.joaov7r.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaov7r.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
