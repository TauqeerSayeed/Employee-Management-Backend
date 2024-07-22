package com.example.employee_management.Service;

import com.example.employee_management.Exception.userNotFoundException;
import com.example.employee_management.Repository.DesignationRepository;
import com.example.employee_management.Repository.EmployeeRepository;
import com.example.employee_management.Transformer.EmployeeTransformer;
import com.example.employee_management.dto.request.EmployeeRequest;
import com.example.employee_management.dto.response.DesignationResponse;
import com.example.employee_management.dto.response.EmployeeResponse;
import com.example.employee_management.model.Designation;
import com.example.employee_management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DesignationRepository designationRepository;
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public EmployeeResponse addEmployee(EmployeeRequest employeeRequest, int id) {
        Optional<Designation> optionalDesignation = designationRepository.findById(id);
        if(optionalDesignation.isEmpty()){
            throw new userNotFoundException("designation not exist");
        }
        Designation designation = optionalDesignation.get();
        Employee employee = EmployeeTransformer.employeeRequestToEmployee(employeeRequest,designation);
        employeeRepository.save(employee);

        return EmployeeTransformer.employeeToEmployeeResponse(employee);
    }

    public EmployeeResponse getById(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if(optionalEmployee.isEmpty()){
            throw new userNotFoundException("Employee not exist");
        }
        Employee employee = optionalEmployee.get();
        return EmployeeTransformer.employeeToEmployeeResponse(employee);
    }


    public String deleteAll() {
        employeeRepository.deleteAll();
        return "Deleted Successfully!!";
    }

    public String deleteById(int id) {
        employeeRepository.deleteById(id);
        return "deleted successfully!!";
    }


    public Employee updateById(int id,
                                       Employee employee) {
        Employee savedEmployee = new Employee();
        if(id == employee.getEmployeeId()){
            savedEmployee = employeeRepository.save(employee);
        }
        return savedEmployee;
    }
}
