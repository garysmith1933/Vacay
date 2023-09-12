package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="excursion_title")
    private String excursionTitle;
    @Column(name="excursion_price")
    private BigDecimal excursionPrice;
    @Column(name="image_URL")
    private String imageUrl;
    @Column(name="create_date")
    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    @Column(name="last_update")
    private Date lastUpdate;
    private Vacation vacation;
    private Set<CartItem> cartitems;
}
