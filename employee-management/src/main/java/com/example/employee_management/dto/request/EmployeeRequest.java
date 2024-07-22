package com.example.employee_management.dto.request;

import com.example.employee_management.model.Designation;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeRequest {
    private String name;

    private int age;

    private String email;

    private String gender;

//    private int designationId;
}
