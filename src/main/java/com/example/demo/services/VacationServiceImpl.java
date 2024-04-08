package com.example.demo.services;

import com.example.demo.dao.VacationRepository;
import com.example.demo.entity.Vacation;
import com.example.demo.services.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationServiceImpl implements VacationService {

  @Autowired
  private VacationRepository vacationRepository;

  @Override
  public List<Vacation> fetch_vacations() {
    return this.vacationRepository.findAll();
  }
}