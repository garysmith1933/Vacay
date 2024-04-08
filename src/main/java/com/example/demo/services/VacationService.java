package com.example.demo.services;

import com.example.demo.entity.Vacation;

import java.util.List;

public interface VacationService {
  List<Vacation> fetch_vacations();
}