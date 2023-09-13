package com.example.demo.dao;

import com.example.demo.entity.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
