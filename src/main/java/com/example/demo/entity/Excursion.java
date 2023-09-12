package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="excursions")
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
    @ManyToOne
    @JoinTable(name = "vacations_id")
    private Vacation vacation;
    @ManyToMany(mappedBy = "excursions")
    private Set<CartItem> cartItems;
}
