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

 // Find an employee by email
    Optional<Employee> findByEmail(String email);

    // Find employees by department name
    List<Employee> findByDepartmentName(String departmentName);

    // Find employees with names containing a given substring
    List<Employee> findByNameContaining(String nameSubstring);

    // Find employees by department's id
    List<Employee> findByDepartmentId(Long departmentId);
// Find employees by department name using JPQL
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

    // Find employees by name using a native SQL query
    @Query(value = "SELECT * FROM employees WHERE name LIKE %:nameSubstring%", nativeQuery = true)
    List<Employee> findEmployeesByNameContaining(@Param("nameSubstring") String nameSubstring);

    // Find an employee by email using JPQL
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Optional<Employee> findEmployeeByEmail(@Param("email") String email);
}
