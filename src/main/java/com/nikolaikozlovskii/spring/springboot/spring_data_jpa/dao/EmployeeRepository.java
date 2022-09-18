package com.nikolaikozlovskii.spring.springboot.spring_data_jpa.dao;


import com.nikolaikozlovskii.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  //Можем добавить недостающие методы(имена задавать по подсказке IDE
    public List<Employee> findAllByName(String name);
}
