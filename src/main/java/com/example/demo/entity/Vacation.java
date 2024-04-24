package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="vacations")
@Getter
@Setter
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vacation_id")
    private Long id;
    @Column(name="vacation_title")
    private String vacationTitle;
    @Column(name="description")
    private String description;
    @Column(name="travel_fare_price")
    private Double travelPrice;
    @Column(name="image_url")
    private String imageURL;
    @Column(name="create_date")
    @CreationTimestamp
    private Timestamp create_date;
    @Column(name="last_update")
    @UpdateTimestamp
    private Timestamp last_update;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation") - will bring back once excursions are worked on
//    private Set<Excursion> excursions;

    public Vacation(String title, String description, Double price) {
    this.vacationTitle = title;
    this.description = description;
    this.travelPrice = price;
  }

    public Vacation() {}
}
