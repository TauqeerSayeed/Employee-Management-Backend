package com.example.employee_management.Service;


import com.example.employee_management.Repository.DesignationRepository;
import com.example.employee_management.Transformer.DesignationTransformer;
import com.example.employee_management.dto.request.DesignationRequest;
import com.example.employee_management.dto.response.DesignationResponse;
import com.example.employee_management.model.Designation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationService {

    @Autowired
    DesignationRepository designationRepository;
    public DesignationResponse addDesignation(DesignationRequest designationRequest) {
        Designation designation = new Designation();
        designation.setDesignation_name(designationRequest.getDesignation_name());
        designation.setSalary(designationRequest.getSalary());
        Designation savedDesignation = designationRepository.save(designation);
        return DesignationTransformer.designationToDesignationResponse(savedDesignation);
    }

    public List<Designation> getAll() {
        List<Designation> designations = designationRepository.findAll();
        return designations;
    }
}
