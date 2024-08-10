package com.example.JavaApplicationUsingMongoDB.Entity;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee
{

    @Id
    int id;

    String employeename;

    String employeedepartment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeedepartment() {
        return employeedepartment;
    }

    public void setEmployeedepartment(String employeedepartment) {
        this.employeedepartment = employeedepartment;
    }
}
