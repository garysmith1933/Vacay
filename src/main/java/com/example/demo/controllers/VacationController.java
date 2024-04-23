package com.example.demo.controllers;

import com.example.demo.entity.Vacation;
import com.example.demo.services.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class VacationController {

  @Autowired
  private VacationService vacationService;

  @GetMapping("/vacations")
  public List<Vacation> fetch_vacations() {
    return vacationService.fetch_vacations();
  }
}