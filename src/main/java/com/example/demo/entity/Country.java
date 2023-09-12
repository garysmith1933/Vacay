package src.main.java.com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="Countries")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="country_name")
    private String countryName;
    @Column(name="create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name="last_update")
    @UpdateTimestamp
    private Date lastUpdate;
    //private Set<Division> divisions;
}
