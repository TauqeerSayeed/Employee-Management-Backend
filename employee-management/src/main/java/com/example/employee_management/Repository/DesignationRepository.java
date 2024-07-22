package com.example.employee_management.Repository;

import com.example.employee_management.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation,Integer> {

    @Query(value = "select designation_id from employee_info where employee_id= :employeeId",nativeQuery = true)
    Designation getDesignationByEmployeeId(@Param("employeeId") int employeeId);
}
