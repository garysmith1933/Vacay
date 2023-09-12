package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="cart_items")
@Getter
@Setter
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "vacations_id")
    private Vacation vacation;
    @ManyToMany
    @JoinTable(name="excursion_cartItems",
            joinColumns= @JoinColumn(name="cart_items_id"),
            inverseJoinColumns = @JoinColumn(name="excursions_id"))
    private Set<Excursion> excursions;
    @ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;
    private Date createDate;
    private Date lastUpdate;
}
