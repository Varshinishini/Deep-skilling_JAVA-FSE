package com.example.employeemanagementsystem.dto;

import lombok.Data;

@Data
public class DepartmentDTO {

    private Long id;
    private String name;

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
