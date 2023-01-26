package com.example.organizationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Organizations")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Organization {
    @Id
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;

}
