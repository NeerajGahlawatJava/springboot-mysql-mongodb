package com.app.neeraj.repository;

import com.app.neeraj.document.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer> {
}
