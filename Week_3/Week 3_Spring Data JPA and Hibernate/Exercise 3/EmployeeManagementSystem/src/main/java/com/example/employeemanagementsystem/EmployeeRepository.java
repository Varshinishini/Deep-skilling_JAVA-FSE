package com.example.EmployeeManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived Query Method: Find employees by department ID
    List<Employee> findByDepartmentId(Long departmentId);

    // Derived Query Method: Find employees by name
    List<Employee> findByName(String name);
}
