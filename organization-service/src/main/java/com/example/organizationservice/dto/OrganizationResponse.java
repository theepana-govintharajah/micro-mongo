package com.example.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationResponse {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;

}
