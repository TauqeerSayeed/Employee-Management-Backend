package com.example.employee_management.Controller;

import com.example.employee_management.Service.DesignationService;
import com.example.employee_management.dto.request.DesignationRequest;
import com.example.employee_management.dto.response.DesignationResponse;
import com.example.employee_management.model.Designation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/add")
    public void addDesignation(@RequestBody DesignationRequest designationRequest){
        designationService.addDesignation(designationRequest);

    }

    @GetMapping("/get-all-designation")
    public List<Designation> getAll(){
        return designationService.getAll();
    }
}
