package com.example.employee_management.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employee_info")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String name;

    private int age;

    private String email;

    private String gender;

    @ManyToOne
    @JoinColumn(name = "designation_id")
    private Designation designation;

}
