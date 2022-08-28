package com.Likelion22.Homework_Week22.Controller;

import com.Likelion22.Homework_Week22.DTO.DepartmentDTO;
import com.Likelion22.Homework_Week22.Entity.Department;
import com.Likelion22.Homework_Week22.Entity.Employee;
import com.Likelion22.Homework_Week22.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department)
    {
        return departmentService.createDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments()
    {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{deptId}")
    public Department getDeptById(@PathVariable long deptId)
    {
        Department department = departmentService.getDeptById(deptId);
        return department;
    }



}
