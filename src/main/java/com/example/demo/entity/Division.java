package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
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
