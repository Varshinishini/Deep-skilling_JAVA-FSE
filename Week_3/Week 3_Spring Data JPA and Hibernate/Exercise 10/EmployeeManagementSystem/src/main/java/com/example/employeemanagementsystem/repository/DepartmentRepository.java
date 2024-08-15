package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Department;
import com.example.employeemanagementsystem.projection.DepartmentSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Return specific fields for departments
    @Query("SELECT d.id AS id, d.name AS name FROM Department d")
    List<DepartmentSummary> findDepartmentSummaries();
 List<DepartmentDTO> findDepartmentDTOs();
 List<DepartmentProjection> findDepartmentProjections();
}
