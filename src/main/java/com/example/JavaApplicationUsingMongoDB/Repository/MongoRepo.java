package com.example.JavaApplicationUsingMongoDB.Repository;

import com.example.JavaApplicationUsingMongoDB.Entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository<Employee, Integer> {

    // Custom query to find the document with the highest ID
    @Query(value = "{}", sort = "{ 'id': -1 }")
    Employee findTopByOrderByIdDesc();
}
