package com.app.neeraj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {

    private String empId;

    private String email;

    private String firstName;

    private String lastName;

    private String dob;

    private long salary;

    private String country;

    private DepartmentModel department;
}
