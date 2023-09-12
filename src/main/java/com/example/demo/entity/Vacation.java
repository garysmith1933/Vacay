package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="vacation_title")
    private String vacationTitle;
    @Column(name="travel_price")
    private BigDecimal travelPrice;
    @Column(name="image_URL")
    private String imageURL;
    @Column(name="create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name="last_update")
    @UpdateTimestamp
    private Date lastUpdate;
    private Set<Excursion> excursions;
}
