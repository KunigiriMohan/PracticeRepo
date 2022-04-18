package com.example.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Locations {

    @Id
    private Integer locationId;
    private String stringAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    private String countryId;
}
