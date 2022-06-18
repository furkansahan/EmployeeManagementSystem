package com.furkansahan.employeemanagementsystem.repository;

import com.furkansahan.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository <Employee ,Integer> {
}
