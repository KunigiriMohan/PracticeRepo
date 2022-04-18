package com.example.practice.repositoryimpl;

import com.example.practice.model.CountryRegion;
import com.example.practice.model.Employees;
import com.example.practice.model.EmplyeeDetails;
import com.example.practice.repository.ShoppingRepo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@EnableScheduling
public class ShoppingRepoImpl implements ShoppingRepo {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Object getCountryById(String iD) {
        String query = "select new com.example.practice.model.Countries(c.countryId,c.countryName,c.regionId) from Countries c where c.countryId=:countId ";
        Query query1 = entityManager.createQuery(query).setParameter("countId",iD);
        return query1.getSingleResult();
    }

    @Override
    public CountryRegion getCountryDetailsById(String iD) {
        String query = "select new com.example.practice.model.CountryRegion(c.regionId,c.countryName,c.countryId,r.regionName) from Countries c inner join Regions r on c.regionId=r.regionId where c.countryId=:countId";
        Query query1 = entityManager.createQuery(query).setParameter("countId",iD);
        return (CountryRegion) query1.getSingleResult();

    }

    @Override
    public List<CountryRegion> getAllCountries() {
        String query = "select new com.example.practice.model.CountryRegion(c.regionId,r.regionName,count(c.regionId) ) from Countries c inner join Regions r on c.regionId=r.regionId group by r.regionName";
        Query query1 = entityManager.createQuery(query);
        return query1.getResultList();
    }

    @Override
    public List<EmplyeeDetails> getAllEmployees() {
        String query = "select new com.example.practice.model.EmplyeeDetails(e.employeeId,e.firstName,e.lastName,e.email, e.phoneNumber, e.hireDate,e.jobId,e.salary,e.managerId, d.departmentName,l.stringAddress, l.postalCode, l.city, l.stateProvince,l.countryId) from Employees e inner join Departments d on e.departmentId=d.departmentId inner join Locations l on d.locationId=l.locationId";
        Query query1 = entityManager.createQuery(query);
        return query1.getResultList();
    }

    @Override
    public List<EmplyeeDetails> noofEmployeeByDepartment() {
        String query = "select new com.example.practice.model.EmplyeeDetails(d.departmentName,count(e.departmentId)) from Employees e inner join Departments d on e.departmentId=d.departmentId group by e.departmentId";
        Query query1 = entityManager.createQuery(query);
        return query1.getResultList();
    }

    @Override
    public List<Employees> getAllEmployeesbetweenID(Long startId,Long endId) {
        String query = "select new com.example.practice.model.Employees(e.employeeId,e.firstName,e.lastName,e.phoneNumber,e.email) from Employees e where e.employeeId between :startingId and :endingId";
        Query query1 = entityManager.createQuery(query).setParameter("startingId",startId).setParameter("endingId",endId);
        return query1.getResultList();
    }
}
