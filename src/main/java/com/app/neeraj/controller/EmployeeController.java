package com.app.neeraj.controller;

import com.app.neeraj.model.EmployeeModel;
import com.app.neeraj.model.ResponseWrapper;
import com.app.neeraj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<EmployeeModel> registerEmployee(@RequestBody EmployeeModel employee){
       return new ResponseEntity<>(employeeService.registerEmployee(employee), HttpStatus.CREATED);
    }

}
