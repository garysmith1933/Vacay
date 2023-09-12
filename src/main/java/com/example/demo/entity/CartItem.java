package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class CartItem {
    private Long id;
    private Vacation vacation;
    private Set<Exursion> excursions;
    private Cart cart;
    private Date createDate;
    private Date lastUpdate;
}
