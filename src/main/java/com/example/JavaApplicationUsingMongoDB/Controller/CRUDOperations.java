package com.example.JavaApplicationUsingMongoDB.Controller;

import com.example.JavaApplicationUsingMongoDB.Entity.Employee;
import com.example.JavaApplicationUsingMongoDB.Repository.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crud")
public class CRUDOperations {

    @Autowired
    MongoRepo mongoRepo;


    @GetMapping("/getAll")
    public List<Employee> get()
    {
        return mongoRepo.findAll();
    }

    @PostMapping("/create")
    public Employee post(@RequestBody Employee employee)
    {
        return mongoRepo.save(employee);
    }

}
