package com.Likelion22.Homework_Week22.Controller;

import com.Likelion22.Homework_Week22.DTO.DepartmentDTO;
import com.Likelion22.Homework_Week22.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentDTOController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/mybatis/{departmentId}")
    public DepartmentDTO getNumEmployee(@PathVariable(name = "deptId") long departmentId)
    {
        //DepartmentDTO department = departmentService.getNumAllEmployee(departmentId);
        return departmentService.getNumAllEmployee(departmentId);
    }

}
