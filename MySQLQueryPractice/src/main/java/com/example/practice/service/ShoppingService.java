package com.example.practice.service;

import com.example.practice.model.CountryRegion;
import com.example.practice.model.Employees;
import com.example.practice.model.EmplyeeDetails;

import java.util.List;

public interface ShoppingService {
    Object getCountryById(String id);
    CountryRegion getCountryDetailsById(String id);
    List<CountryRegion> getAllCountriesDetails();
    List<EmplyeeDetails> getAllEmployees();
    List<EmplyeeDetails> getNoofEmployeesinDepartment();
    List<Employees> getAllEmployeesbetweenID(Long startId, Long enId);
}
