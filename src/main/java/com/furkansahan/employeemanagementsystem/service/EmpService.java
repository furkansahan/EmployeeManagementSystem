package com.furkansahan.employeemanagementsystem.service;

import com.furkansahan.employeemanagementsystem.entity.Employee;
import com.furkansahan.employeemanagementsystem.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repository;

    public void addEmp(Employee e){
        repository.save(e);
    }
    public List<Employee> getAllEmp(){
        return repository.findAll();
    }
}
