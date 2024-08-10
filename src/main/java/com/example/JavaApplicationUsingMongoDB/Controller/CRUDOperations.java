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

    public Integer getNextId() {
        // Retrieve the last used ID or generate the next ID manually
        Employee lastEmployee = mongoRepo.findTopByOrderByIdDesc();
        return lastEmployee != null ? lastEmployee.getId() + 1 : 1;
    }


    @GetMapping("/getAll")
    public List<Employee> get()
    {
        return mongoRepo.findAll();
    }

    @PostMapping("/create")
    public Employee post(@RequestBody Employee employee)
    {
//        employee.setId(getNextId());
        return mongoRepo.save(employee);

    }

}
