package com.example.demo.dao;

import com.example.demo.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}
