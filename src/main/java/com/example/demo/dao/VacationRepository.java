package com.example.demo.dao;

import com.example.demo.entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
public interface VacationRepository extends JpaRepository<Vacation, Long> {
    @Query("SELECT vacation FROM Vacation vacation WHERE vacation.vacation_title = :title")
    Optional<Vacation> findByVacationTitle(@Param("title") String title);
}
