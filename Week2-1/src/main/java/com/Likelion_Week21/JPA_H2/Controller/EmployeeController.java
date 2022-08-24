package com.Likelion_Week21.JPA_H2.Controller;

import com.Likelion_Week21.JPA_H2.DTO.DepartmentDTO;
import com.Likelion_Week21.JPA_H2.DTO.EmployeeDTO;
import com.Likelion_Week21.JPA_H2.Service.DepartmentService;
import com.Likelion_Week21.JPA_H2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public void create(@RequestBody EmployeeDTO employeeDTO)
    {
        employeeService.create(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> findAll()
    {
        return employeeService.findAll();
    }
}
