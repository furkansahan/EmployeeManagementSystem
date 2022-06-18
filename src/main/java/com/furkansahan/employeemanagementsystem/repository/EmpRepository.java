package com.furkansahan.employeemanagementsystem.repository;

import com.furkansahan.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository <Employee ,Integer> {
}
