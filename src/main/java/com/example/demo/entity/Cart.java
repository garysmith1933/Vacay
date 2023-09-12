package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
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
//    private ENUM status;
    @Column(name="create_update")
    @CreationTimestamp
    private Date createDate;
    @Column(name="last_update")
    private Date lastUpdate;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    private Set<CartItem> cartItem;
}
