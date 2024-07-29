package com.example.employee_management.Controller;


import com.example.employee_management.Service.EmployeeService;
import com.example.employee_management.dto.request.EmployeeRequest;
import com.example.employee_management.dto.response.EmployeeResponse;
import com.example.employee_management.model.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/get-by-id/{id}")
    public EmployeeResponse getById(@PathVariable("id") int id){
        return employeeService.getById(id);
    }

    @PostMapping("/add/{id}")
    public EmployeeResponse  addEmployee(@Valid @RequestBody EmployeeRequest employeeRequest,
                             @PathVariable("id") int id){
        return employeeService.addEmployee(employeeRequest,id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        return employeeService.deleteAll();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public String deleteById(@PathVariable("id") int id){
        return employeeService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateById(@PathVariable("id") int id,
                                       @RequestBody Employee employee){
        return employeeService.updateById(id,employee);
    }



}
