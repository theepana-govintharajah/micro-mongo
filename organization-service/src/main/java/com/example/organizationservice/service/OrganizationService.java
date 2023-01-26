package com.example.organizationservice.service;

import com.example.organizationservice.dto.OrganizationRequest;
import com.example.organizationservice.dto.OrganizationResponse;
import com.example.organizationservice.model.Organization;
import com.example.organizationservice.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class OrganizationService {


    private final OrganizationRepository organizationRepository;

    public void createOrganization(OrganizationRequest organizationRequest){

        Organization organization=Organization.builder()
                .name(organizationRequest.getName())
                .email(organizationRequest.getEmail())
                .phoneNumber(organizationRequest.getPhoneNumber())
                .build();

        organizationRepository.save(organization);
        log.info("Organization {} is saved", organization.getId());
    }

    public List<OrganizationResponse> getAllOrganizations() {
       List <Organization> organizations= organizationRepository.findAll();
       return organizations.stream().map(this::mapToOrganizationResponse).toList();
    }

    private OrganizationResponse mapToOrganizationResponse(Organization organization) {
        return OrganizationResponse.builder()
                .id(organization.getId())
                .name(organization.getName())
                .email(organization.getEmail())
                .phoneNumber(organization.getPhoneNumber())
                .build();
    }
}
