package com.example.employee_management.Transformer;

import com.example.employee_management.dto.request.DesignationRequest;
import com.example.employee_management.dto.response.DesignationResponse;
import com.example.employee_management.model.Designation;

public class DesignationTransformer {
    public static DesignationResponse designationToDesignationResponse(Designation designation){
        return DesignationResponse.builder()
                .designation_name(designation.getDesignation_name())
                .salary(designation.getSalary())
                .designation_id(designation.getDesignation_id())
                .build();
    }

    public static Designation designationRequestToDesignation(DesignationRequest designationRequest){
        return Designation.builder()
                .designation_name(designationRequest.getDesignation_name())
                .salary(designationRequest.getSalary())
                .build();
    }
}
