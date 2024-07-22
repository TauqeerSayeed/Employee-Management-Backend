package com.example.employee_management.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "designation_record")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int designation_id;

    private String designation_name;

    private double salary;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "designation_id")
//    List<Employee> employees = new ArrayList<>();
}
