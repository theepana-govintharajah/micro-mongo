package com.example.organizationservice.service;

import com.example.organizationservice.dto.OrganizationRequest;
import com.example.organizationservice.model.Organization;
import com.example.organizationservice.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


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
}
