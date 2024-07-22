package com.example.employee_management.Transformer;

import com.example.employee_management.dto.request.EmployeeRequest;
import com.example.employee_management.dto.response.EmployeeResponse;
import com.example.employee_management.model.Designation;
import com.example.employee_management.model.Employee;

public class EmployeeTransformer {

    public static EmployeeResponse employeeToEmployeeResponse(Employee employee){
        return EmployeeResponse.builder()
                .employeeId(employee.getEmployeeId())
                .name(employee.getName())
                .age(employee.getAge())
                .gender(employee.getGender())
                .email(employee.getEmail())
                .designationResponse(DesignationTransformer.designationToDesignationResponse(employee.getDesignation()))
                .build();
    }

    public static Employee employeeRequestToEmployee(EmployeeRequest employeeRequest,
                                                     Designation designation){
        return Employee.builder()
                .name(employeeRequest.getName())
                .age(employeeRequest.getAge())
                .gender(employeeRequest.getGender())
                .email(employeeRequest.getEmail())
                .designation(designation)
                .build();
    }
}
