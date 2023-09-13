package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "customer_first_name", nullable = false)
    private String firstName;
    @Column(name = "customer_last_name", nullable = false)
    private String lastName;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "postal_code", nullable = false)
    private String postal_code;
    @Column(name = "phone", nullable = false)
    private String phone;
    @CreationTimestamp
    @Column(name = "create_date")
    private Date createDate;
    @UpdateTimestamp
    @Column(name = "last_update")
    private Date lastUpdate;
    @OneToOne
    @JoinColumn(name = "division_id")
    private Division division;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Cart> Carts;

    public void addCart(Cart cart) {
        if (this.getCarts() == null) {
            this.setCarts(new HashSet<>());
        }
        this.Carts.add(cart);
        cart.setCustomer(this);
    }
}
