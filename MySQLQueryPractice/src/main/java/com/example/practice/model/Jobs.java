package com.example.practice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Jobs {

    @Id
    private Long jobId;
    private String  jobTitle;
    private Long minSalary;
    private Long maxSalary;
}
