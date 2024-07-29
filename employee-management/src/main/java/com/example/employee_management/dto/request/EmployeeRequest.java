package com.example.employee_management.dto.request;

import com.example.employee_management.model.Designation;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeRequest {

    @NotNull
    @NotEmpty(message = "name is mandatory")
    private String name;

    @NotNull
    private int age;

    @Email(message = "give valid email!!")
    private String email;

    @NotNull
    private String gender;

//    private int designationId;
}
