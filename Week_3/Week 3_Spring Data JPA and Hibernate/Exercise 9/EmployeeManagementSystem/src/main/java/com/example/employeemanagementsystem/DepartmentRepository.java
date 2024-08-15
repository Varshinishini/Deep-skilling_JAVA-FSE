package com.example.EmployeeManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

@Query("SELECT d FROM Department d WHERE d.name = :name")
    Optional<Department> findDepartmentByName(@Param("name") String name);
}
