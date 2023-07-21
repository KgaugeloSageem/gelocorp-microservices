package com.gelocorp.microservices.repository;

import com.gelocorp.microservices.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {}

