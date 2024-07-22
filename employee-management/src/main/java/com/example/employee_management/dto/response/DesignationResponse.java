package com.example.employee_management.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DesignationResponse {
    int designation_id;

    private String designation_name;

    private double salary;
}
