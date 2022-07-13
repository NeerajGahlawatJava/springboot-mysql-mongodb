package com.app.neeraj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @EmbeddedId
    private CompositeEmployeePrimaryKey compositeEmployeePrimaryKey;

    private String firstName;

    private String lastName;

    private String dob;

    private long salary;

    private String country;
}
