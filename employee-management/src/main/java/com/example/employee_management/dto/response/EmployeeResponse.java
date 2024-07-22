package com.example.employee_management.dto.response;


import com.example.employee_management.model.Designation;
import jakarta.persistence.Column;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class EmployeeResponse {

    private int employeeId;

    private String name;

    private int age;

    private String email;

    private String gender;

    DesignationResponse designationResponse;

}
