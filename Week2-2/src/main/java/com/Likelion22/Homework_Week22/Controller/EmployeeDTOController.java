package com.Likelion22.Homework_Week22.Controller;

import com.Likelion22.Homework_Week22.DTO.EmployeeDTO;
import com.Likelion22.Homework_Week22.Entity.Employee;
import com.Likelion22.Homework_Week22.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class EmployeeDTOController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value="/{employeeId}")
    public EmployeeDTO findByDeptId(@PathVariable long employeeId)
    {
        EmployeeDTO employee = employeeService.findByDepartmentId(employeeId);
        //return employeeService.findByDepartmentId(employeeId);
        return employee ;
    }
}
