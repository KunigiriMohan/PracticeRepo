package com.example.practice.repository;

import com.example.practice.model.CountryRegion;
import com.example.practice.model.Employees;
import com.example.practice.model.EmplyeeDetails;

import java.util.List;

public interface ShoppingRepo {
    Object getCountryById(String iD);
    CountryRegion getCountryDetailsById(String iD);
    List<CountryRegion> getAllCountries();
    List<EmplyeeDetails> getAllEmployees();
    List<EmplyeeDetails> noofEmployeeByDepartment();
    List<Employees> getAllEmployeesbetweenID(Long startId,Long enId);
}
