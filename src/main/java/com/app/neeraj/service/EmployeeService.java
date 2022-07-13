package com.app.neeraj.service;

import com.app.neeraj.document.Department;
import com.app.neeraj.entity.CompositeEmployeePrimaryKey;
import com.app.neeraj.entity.Employee;
import com.app.neeraj.model.DepartmentModel;
import com.app.neeraj.model.EmployeeModel;
import com.app.neeraj.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentService departmentService;

    public EmployeeModel registerEmployee(EmployeeModel employeeModel) {
        DepartmentModel department = employeeModel.getDepartment();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeModel, employee);
        CompositeEmployeePrimaryKey compositeEmployeePrimaryKey = new CompositeEmployeePrimaryKey(employeeModel.getEmpId(), employeeModel.getEmail());
        employee.setCompositeEmployeePrimaryKey(compositeEmployeePrimaryKey);
        employeeRepository.save(employee);
        departmentService.saveDepartment(employeeModel.getDepartment());
        return employeeModel;
    }
}
