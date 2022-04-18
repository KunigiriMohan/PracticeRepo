package com.example.practice.serviceimpl;

import com.example.practice.controller.ShoppingController;
import com.example.practice.model.CountryRegion;
import com.example.practice.model.Employees;
import com.example.practice.model.EmplyeeDetails;
import com.example.practice.repository.ShoppingRepo;
import com.example.practice.service.ShoppingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
@EnableScheduling
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    ShoppingRepo shoppingRepo;

    public static Logger logger = LoggerFactory.getLogger(ShoppingController.class);

    @Override
    public Object getCountryById(String id) {
        return shoppingRepo.getCountryById(id);
    }

    @Override
    public CountryRegion getCountryDetailsById(String id) {
        return shoppingRepo.getCountryDetailsById(id);
    }

    @Override
    public List<CountryRegion> getAllCountriesDetails() {
        return shoppingRepo.getAllCountries();
    }

    @Override
    public List<EmplyeeDetails> getAllEmployees() {
        return shoppingRepo.getAllEmployees();
    }

    @Override
    @Scheduled(cron = "*/4 * * * * *")
    public List<EmplyeeDetails> getNoofEmployeesinDepartment() {
        logger.info("service method details : {}",new Date());
        System.out.println(shoppingRepo.noofEmployeeByDepartment().get(0).getDepartmentName());
        return shoppingRepo.noofEmployeeByDepartment();
    }

    @Override
    public List<Employees> getAllEmployeesbetweenID(Long startId, Long enId) {
        return shoppingRepo.getAllEmployeesbetweenID(startId,enId);
    }
}
