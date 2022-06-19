package com.furkansahan.employeemanagementsystem.controller;

import com.furkansahan.employeemanagementsystem.entity.Employee;
import com.furkansahan.employeemanagementsystem.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService service;


    @GetMapping("/")
    public String home(Model model){
        List<Employee> emp=service.getAllEmp();
        model.addAttribute("emp");
        return "index";
    }
    @GetMapping("/addemp")
    public String addEmp(){
        return"add_emp";
    }
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e , HttpSession session){
        System.out.println(e);
        service.addEmp(e);
        session.setAttribute("msg","Employee Added Successfully");
        return "redirect:/";
    }
}
