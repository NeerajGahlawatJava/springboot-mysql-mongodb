package com.app.neeraj.service;

import com.app.neeraj.document.Department;
import com.app.neeraj.model.DepartmentModel;
import com.app.neeraj.repository.DepartmentRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveDepartment(DepartmentModel departmentModel) {
        Department department = new Department();
        BeanUtils.copyProperties(departmentModel, department);
        departmentRepository.save(department);
    }
}
