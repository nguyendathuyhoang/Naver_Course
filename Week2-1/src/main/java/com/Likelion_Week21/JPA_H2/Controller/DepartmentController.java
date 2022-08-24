package com.Likelion_Week21.JPA_H2.Controller;

import com.Likelion_Week21.JPA_H2.DTO.DepartmentDTO;
import com.Likelion_Week21.JPA_H2.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public void create(@RequestBody DepartmentDTO dept_dto)
    {
        departmentService.create(dept_dto);
    }

    @GetMapping
    public List<DepartmentDTO> findAll()
    {
        return departmentService.findAll();
    }
}
