package com.example.practice.controller;

import com.example.practice.model.CountryRegion;
import com.example.practice.model.Employees;
import com.example.practice.model.EmplyeeDetails;
import com.example.practice.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @GetMapping("/getCustomerById/{id}")
    public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id) {
        Object customers = shoppingService.getCountryById(id);
        return new ResponseEntity<Object>(customers, HttpStatus.OK);
    }

    @GetMapping("/getCountryDetailsByid/{id}")
    public ResponseEntity<CountryRegion> getCountryDetailsById(@PathVariable("id") String id) {
        CountryRegion countryRegion = shoppingService.getCountryDetailsById(id);
        return new ResponseEntity<CountryRegion>(countryRegion, HttpStatus.OK);
    }

    @GetMapping("/getAllCountriesDetails")
    public ResponseEntity<List<CountryRegion>> getAllCountriesDetails() {
        List<CountryRegion> countryRegions = shoppingService.getAllCountriesDetails();
        return new ResponseEntity<List<CountryRegion>>(countryRegions, HttpStatus.OK);
    }

    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<EmplyeeDetails>> getAllEmployeeDetails() {
        List<EmplyeeDetails> emplyeeDetails = shoppingService.getAllEmployees();
        return new ResponseEntity<List<EmplyeeDetails>>(emplyeeDetails, HttpStatus.OK);
    }

    @GetMapping("/getNoofEmployeesinDepartment")
    public ResponseEntity<List<EmplyeeDetails>> getNoofEmployeesinDepartment() {
        List<EmplyeeDetails> emplyeeDetails = shoppingService.getNoofEmployeesinDepartment();
        return new ResponseEntity<List<EmplyeeDetails>>(emplyeeDetails, HttpStatus.OK);
    }

    @GetMapping("/getallemployeesbetweenid")
    public ResponseEntity<List<Employees>> getEmployeesBetweenId(@RequestParam Long sartId, @RequestParam Long endId) {
        List<Employees> employees = shoppingService.getAllEmployeesbetweenID(sartId,endId);
        return new ResponseEntity<List<Employees>>(employees,HttpStatus.OK);
    }

}
