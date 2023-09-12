package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="division_name")
    private String divisionName;
    @Column(name="create_date")
    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    @Column(name="last_update")
    private Date lastUpdate;
}
