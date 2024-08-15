package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employees by department name with pagination and sorting
    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);

    // Find employees by name containing a substring with pagination and sorting
    Page<Employee> findByNameContaining(String nameSubstring, Pageable pageable);

    // Find an employee by email
    Optional<Employee> findByEmail(String email);
}
