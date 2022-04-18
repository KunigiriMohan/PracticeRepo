package com.example.practice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryRegion {
    private Integer regionId;
    private String regionName;
    private String countryId;
    private String countryName;
    private Long count;

    public CountryRegion(Integer regionId, String regionName, String countryId, String countryName) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public CountryRegion(Integer regionId, String regionName, Long count) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.count = count;
    }
}
