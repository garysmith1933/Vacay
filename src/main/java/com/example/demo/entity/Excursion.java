package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Excursion {
    private Long id;
    private String excursion_title;
    private BigDecimal excursion_price;
    private String imageUrl;
    private Date createDate;
    private Date lastUpdate;
//    private Vacation vacation;
//    private Set<CartItem> cartitems;
}
