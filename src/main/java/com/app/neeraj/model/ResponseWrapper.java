package com.app.neeraj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapper {

    private EmployeeModel employeeWrapper;

    private DepartmentModel departmentWrapper;
}
