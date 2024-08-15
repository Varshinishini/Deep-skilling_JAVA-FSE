package com.example.employeemanagementsystem.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;

    public EmployeeDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
