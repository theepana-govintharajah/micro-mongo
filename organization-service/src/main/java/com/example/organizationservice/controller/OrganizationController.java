package com.example.organizationservice.controller;


import com.example.organizationservice.dto.OrganizationRequest;
import com.example.organizationservice.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organization")
@RequiredArgsConstructor
public class OrganizationController {


        private final OrganizationService organizationService;
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void createOrganization(@RequestBody OrganizationRequest organizationRequest){
                organizationService.createOrganization(organizationRequest);
        }

}
