package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //if error compare fields to script;
    @Column(name="id")
    private Long id;
    @Column(name = "orderTrackingNumber")
    private String orderTrackingNumber;
    @Column(name="package_price")
    private BigDecimal packagePrice;
    @Column(name="part_size")
    private int partySize;
//    @Column(name="status")
    //private SOMETHING ABOUT ENUM status
    @Column(name="create_update")
    @CreationTimestamp
    private Date createDate;
    @Column(name="last_update")
    private Date lastUpdate;
//    private Customer customer;
//    private Set<CartItem> cartItem;
}
