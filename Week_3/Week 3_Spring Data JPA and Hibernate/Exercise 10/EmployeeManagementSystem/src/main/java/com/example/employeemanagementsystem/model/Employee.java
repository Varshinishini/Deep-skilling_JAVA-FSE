package com.example.employeemanagementsystem.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "last_modified_date")
    private LocalDateTime lastModifiedDate;
}
