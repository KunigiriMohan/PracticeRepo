package com.example.practice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmplyeeDetails {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private Long jobId;
    private Long salary;
    private Long managerId;
    private String departmentName;
    //private Long locationId;
    private String stringAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    private String countryId;
    private Long noofEmployeeinDepartment;
    private String jobTitle;
    private Long minSalary;
    private Long maxSalary;

    public EmplyeeDetails(Long employeeId, String firstName, String lastName, String email, String phoneNumber,String jobTitle) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.jobTitle=jobTitle;
    }
    public EmplyeeDetails(String departmentName, Long noofEmployeeinDepartment) {
        this.noofEmployeeinDepartment = noofEmployeeinDepartment;
        this.departmentName = departmentName;
    }

    public EmplyeeDetails(Long employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate, Long jobId, Long salary, Long managerId, String departmentName, /*Long locationId,*/ String stringAddress, String postalCode, String city, String stateProvince, String countryId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.managerId = managerId;
        this.departmentName = departmentName;
        /*this.locationId = locationId;*/
        this.stringAddress = stringAddress;
        this.postalCode = postalCode;
        this.city = city;
        this.stateProvince = stateProvince;
        this.countryId = countryId;
    }
}
